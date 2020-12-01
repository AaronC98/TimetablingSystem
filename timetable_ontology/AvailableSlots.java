package timetable_ontology;

import java.util.ArrayList;
import java.util.List;

import jade.content.Concept;
import jade.core.AID;


public class AvailableSlots implements Concept {
	/**
	 * 
	 */
	private List<Tutorial> slots = new ArrayList<>();
	private List<AID> owners = new ArrayList<>();
	
	public List<Tutorial> getSlots() {
		return slots;
	}

	public void setSlots(List<Tutorial> slots) {
		this.slots = slots;
	}

	public List<AID> getOwners() {
		return owners;
	}

	public void setOwners(List<AID> owners) {
		this.owners = owners;
	}
	
}
