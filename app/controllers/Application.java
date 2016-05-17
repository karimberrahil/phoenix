package controllers;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

import org.json.JSONException;

import play.*;
import play.api.Play.*;
import play.mvc.*;
import play.db.*;
import play.data.*;
import models.*;
import play.libs.*;
import com.typesafe.config.ConfigFactory;
import play.cache.*;

public class Application extends Controller {	
		
	javax.sql.DataSource db = DB.getDataSource();
	
	public static Form<User> userForm = Form.form(User.class);
	public static Form<User> loginForm = Form.form(User.class);
	public static Form<Don> donForm = Form.form(Don.class);
	
	/**
	 * lLance la page accueil et affichivhe les membes(pour les test sql)
	 */
	public static Result index() {
		String flash = flash("message");
		return ok(views.html.index.render(flash, User.all()));
	}
	public static Result show(Long id) {
		User user = User.find.ref(id);
		String flash = flash("message");
		return ok();
	}

	/**
	 * Page d'inscription
	 */
	public static Result register() {
		return ok(views.html.register.render(userForm));
	}
	
	/**
	 * Annalyse le formulaire d'inscription pour creer un nouvel utilisateur
	 */
	public static Result newUser() {
		Form<User> filledForm = userForm.bindFromRequest();
		if(filledForm.hasErrors()) {
			flash("message", "Echec de l'inscription. Veuillez recommencer.");
			return redirect(routes.Application.index());
		} else {
		    User.create(filledForm.get());
		    session("connected", filledForm.data().get("adresseMail"));
		    flash("message", "Compte cree avec succes.");
		    return redirect(routes.Application.index());  
		}
	}

	
	public static Result confirmDon(Long id_prj) {
		donForm.data().put("project_id", id_prj.toString());
		return ok(views.html.validate.render(donForm, id_prj));
	}
	public static Result validate() {
		Form<Don> filledForm = donForm.bindFromRequest();
	    if(filledForm.data().get("accept")==null){
	    	flash("message", "Echec de l'inscription. Vous n'avez pas acceptez les termes d'utilisation.");
			return redirect(routes.Application.confirmDon(Long.valueOf(filledForm.data().get("project_id")).longValue()));
	    }
	    else if(filledForm.hasErrors()) {
			flash("message", "Echec du don. Veuillez recommencer.");
			return redirect(routes.Application.confirmDon(Long.valueOf(filledForm.data().get("project_id")).longValue()));
		}
	    else {
		    Don.create(filledForm.get());
		    return redirect(routes.Application.index());  
		}
	}
	
	
	
}
