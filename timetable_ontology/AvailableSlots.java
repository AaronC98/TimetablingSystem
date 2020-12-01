package timetable_ontology;

import java.util.ArrayList;
import java.util.List;

import jade.content.Concept;
import jade.content.Predicate;
import jade.core.AID;


public class AvailableSlots implements Predicate {

	private List<Tutorial> slots = new ArrayList<>();
	
	public List<Tutorial> getSlots() {
		return slots;
	}

	public void setSlots(List<Tutorial> slots) {
		this.slots = slots;
	}




	
}
