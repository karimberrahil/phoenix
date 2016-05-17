package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import controllers.Session;
import models.constraints.Email;
import play.data.validation.Constraints.Max;
import play.data.validation.Constraints.Min;
import play.db.ebean.Model;

@Entity
public class User extends Model{
	
	@Id
	public int id;
	@Email
	@NotNull
	public String adresseMail;
	@NotNull
	public String motDePasse;
	@NotNull
	public String adresseMaison;
	@NotNull
	public int codePostal;
	@Past
	@NotNull
	public Date dateDeNaissance;
	@NotNull
	public String nom;
	@Max(value=3)
	@Min(value=0)
	@NotNull
	public byte permission;
	@NotNull
	public String prenom;
	@NotNull
	public String sexe;
	@NotNull
	public String ville;
	
	public static Finder<Long,User> find = new Finder(Long.class, User.class);

	public static List<User> all() {
		return find.all();
	}
	
	public static User findByUsername(String username) {
        return find.where().eq("username", username).findUnique();
	}

	public static User findById(Long id) {
        return find.ref(id);
	}
	
	public static void create(User user) {
		user.motDePasse = Session.encryptPassword(user.motDePasse);
		user.save();
	}

	public static void delete(Long id) {
		findById(id).delete();
	}

	public void update(User user) {
		user.motDePasse = Session.encryptPassword(user.motDePasse);
		user.update(this.id);
	}
	
    public static User authenticate(String adresseMail, String motDePasse) {
        User user = find.where().eq("adresseMail", adresseMail).findUnique();
        if (user != null && Session.checkPassword(motDePasse, user.motDePasse)) 
        	return user;
        return null;
    }
	

}
