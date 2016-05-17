package controllers;

import play.*;
import play.mvc.*;
import models.*;
import java.io.IOException;

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
import java.lang.Long;

public class Projects extends Controller {
    
	public static Form<Project> projectForm = Form.form(Project.class);

    public static Result listAll() {
        return ok(views.html.projects.render(Project.all()));
    }

    public static Result show(long id) {
        return ok(views.html.project.render(Project.findById(id)))  ;
    }

    public static Result newProject() {
		return ok(views.html.ajoutProjet.render(projectForm));
	}
    public static Result addProject() {
        Form<Project> filledForm = projectForm.bindFromRequest();
		if(filledForm.hasErrors()) {
			flash("message", "Echec de l'ajout du projet.");
			return redirect(routes.Application.index());
		} else {
		    Project.create(filledForm.get());
		    flash("message", "Projet cree avec succes.");
		    return redirect(routes.Application.index());  
		}
    }
}
