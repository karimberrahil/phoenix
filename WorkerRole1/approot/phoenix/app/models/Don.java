package models;
 
import java.util.*;
import javax.persistence.*;
 
import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.io.IOException;

import org.json.JSONException;

import play.*;
import play.db.ebean.*;
import play.db.ebean.Model.Finder;
import play.data.validation.Constraints;
import play.mvc.Http;
import controllers.Session;

import javax.persistence.*;
@Entity
public class Don extends Model {
 
	@Id
	public int id;
	
	public int user_id;
	
	public int project_id;
	
    public int montant;
    
    public int type_dons;
    
    public Date date;
    
    @Lob
    public String description;
    @Constraints.Required
    public boolean accept;
    
	public static Finder<Long,Don> find = new Finder(Long.class, Don.class);


	public static List<Don> all() {
		return find.all();
	}
	

	public static Don findById(Long id) {
        return find.ref(id);
	}
	
	public static void create(Don post) {
		post.save();
	}

	public static void delete(Long id) {
		findById(id).delete();
	}

	public static Project findProjectByProjectId(Long prj_id) {
        return Project.find.where().eq("project_id", prj_id).findUnique();
	}
	
	
   
}