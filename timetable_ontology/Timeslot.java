package timetable_ontology;

import jade.content.Predicate;
import jade.core.AID;

public class Timeslot implements Predicate {

	private static final long serialVersionUID = 1L;
	private AID owner;
	private Tutorial tutorial;
	
	public AID getOwner() {
		return owner;
	}
	
	public void setOwner(AID owner) {
		this.owner = owner;
	}
	
	public Tutorial getTutorial() {
		return tutorial;
	}
	
	public void setTutorial(Tutorial tutorial) {
		this.tutorial = tutorial;
	}
}
