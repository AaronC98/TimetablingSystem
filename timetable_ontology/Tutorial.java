package timetable_ontology;

import jade.content.Concept;
import jade.content.Predicate;
import jade.content.onto.annotations.Slot;
import jade.core.AID;

public class Tutorial implements Concept {
	/**
	 * 
	 */
	AID studentOwner;
	String moduleName;
	String moduleNo;
	String campus;
	String lecturer;
	String day;
	int startTime;
	int endTime;

	public Tutorial() {

	}

	public AID getStudentOwner() {
		return studentOwner;
	}

	public void setStudentOwner(AID studentOwner) {
		this.studentOwner = studentOwner;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleNo() {
		return moduleNo;
	}

	public void setModuleNo(String moduleNo) {
		this.moduleNo = moduleNo;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}
