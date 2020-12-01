package timetable_ontology;

import jade.content.Predicate;
import jade.core.AID;

public class SwapProposal implements Predicate {

	private AID owner;
	private AID proposee;
	private Tutorial slot;
	public AID getOwner() {
		return owner;
	}
	public void setOwner(AID owner) {
		this.owner = owner;
	}
	public AID getProposee() {
		return proposee;
	}
	public void setProposee(AID proposee) {
		this.proposee = proposee;
	}
	public Tutorial getSlot() {
		return slot;
	}
	public void setSlot(Tutorial slot) {
		this.slot = slot;
	}
	
	
	
}
