package models;

import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.io.IOException;

import org.json.JSONException;

import play.*;
import play.db.ebean.*;
import play.data.validation.Constraints;
import play.mvc.Http;
import controllers.Session;

import javax.persistence.*;

@Entity
public class Project extends Model {	

	@Id
	public int id;
	
	//Le titre du projet
	public String title;
	
	// description du projet
	public String description;

	// id du projet parent
	public int id_parent;

	// Somme total a récoltée
	public int total_amount;

	// Somme des dons globaux
	public int donation_amount;

	// Le projet est validé ou non
	public boolean is_validate;

	public boolean is_completed;

	public static Finder<Long,Project> find = new Finder(Long.class, Project.class);

	public static List<Project> all() {
		return find.all();
	}
	
	public static Project findByTitle(String title) {
        return find.where().eq("title", title).findUnique();
	}

	public static List<Project> findSubProjects(long id_prj) {
        return find.where().eq("id_parent", id_prj).findList();
	}

	public static Project findById(Long id_prj) {
        return find.ref(id_prj);
	}
	
	public static boolean isSubProject(Long id_prj) {
        return (findById(id_prj).id_parent != -1);
	}

	public static int getDonationsAmount(Long id_prj){
		Iterator<Project> it = findSubProjects(id_prj).iterator();
		int somme = 0;
		// Calcul du montant recolté par sous projet
		while(it.hasNext()){
			Project prj = it.next();
			//si le sous projet est complété on ajoute au montant
			if(prj.is_completed)
			 somme += prj.total_amount;
		}
		somme += findById(id_prj).donation_amount;
		return somme;
	}

	public static boolean isCompleted(Long id_prj){
		return (getDonationsAmount(id_prj) >= findById(id_prj).total_amount);
	}

	public static void create(Project project) {
		project.save();
	}

	public static void delete(Long id_prj) {
		findById(id_prj).delete();
	}

	public static float getAvancement(Long id_prj) {
		return (getDonationsAmount(id_prj) * 100 / findById(id_prj).total_amount);
	}

	public static void update(Project project) {
		
	}
	

}
