package controllers;

import javax.persistence.Id;

import models.Event;
import models.Project;
import play.mvc.Controller;
import play.mvc.Result;

public class Events extends Controller{
	
	public static Result show(long id) {
        return ok(views.html.event.render(Event.findById(id)));
    }
	
    public static Result listAll() {
        return ok(views.html.events.render(Event.all()));
    }
 
}	
