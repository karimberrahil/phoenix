package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Event extends Model{
	@Id
	public int id;
	
	public String title;
	
	public String description;
	
	public boolean is_validate;
	
	public int nbrTicketsTotal;
	
	public int ticketPrice;
	
	public int nbrPurchasedTickets;
		
	public static Finder<Long,Event> find = new Finder(Long.class, Event.class);
	
	public static List<Event> all() {
		return find.all();
	}
	
	public static Event findByTitle(String title) {
        return find.where().eq("title", title).findUnique();
	}
	
	public static Event findById(Long id_evt) {
        return find.ref(id_evt);
	}
	
	public static float getAvancement(Long id_evt) {
		return (findById(id_evt).nbrPurchasedTickets * 100 / findById(id_evt).nbrTicketsTotal);
	}
	
	public static boolean isFull(Long id_evt){
		return (findById(id_evt).nbrPurchasedTickets >= findById(id_evt).nbrTicketsTotal);
	}
}
