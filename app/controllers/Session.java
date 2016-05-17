package controllers;

import static play.data.Form.form;

import org.mindrot.jbcrypt.BCrypt;

import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Session extends Controller {

    public static class Login {
        
        public String adresseMail;
        public String motDePasse;
        
        public String validate() {
            if(User.authenticate(adresseMail, motDePasse) == null) {
                return "Identifiants incorrects";
            }
            return null;
        }
    }
    
    public static String encryptPassword(String cleanPassword) {
    	if (cleanPassword == null) return null;
		return BCrypt.hashpw(cleanPassword, BCrypt.gensalt());
    }
    
    public static boolean checkPassword(String candidate, String encrypted) {
    	if (candidate == null || encrypted == null) return false;
    	return BCrypt.checkpw(candidate, encrypted);
    }
    
    public static Result login() {
        return ok(views.html.login.render(flash("message"), form(Login.class)));
    }
	
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()) {
            flash("message", "Identifiants incorrects");
            return redirect(routes.Session.login());
        }
        else {
            session("connected", loginForm.get().adresseMail);
            flash("message", "Bon retour sur EPVN.");
    		return redirect(routes.Application.index());
        }
	}
	
	public static Result logout() {
		session().clear();
        flash("message", "Vous etes deconnecte");
	    return redirect(routes.Application.index());  
	}
	
	public static boolean isSessionOwner(User user) {
		if (user.adresseMail.equals(session("connected"))) return true;
		else return false;
	}
	
}
