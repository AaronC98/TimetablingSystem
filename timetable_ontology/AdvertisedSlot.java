package timetable_ontology;

import jade.content.Predicate;
import jade.core.AID;
import timetable_ontology.AvailableSlots;

public class AdvertisedSlot implements Predicate {
	/**
	 * 
	 */
	private AID owner;
	private AvailableSlots advertBoard;
	
	public AID getOwner() {
		return owner;
	}
	
	public void setOwner(AID owner) {
		this.owner = owner;
	}

	public AvailableSlots getAdvertBoard() {
		return advertBoard;
	}

	public void setAdvertBoard(AvailableSlots advertBoard) {
		this.advertBoard = advertBoard;
	}
}
