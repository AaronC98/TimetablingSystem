
public class StudentPreferences {
	String Type;
	String Day;
	int StartTime;
	int EndTime;
	
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) {
		Day = day;
	}

	public int getStartTime() {
		return StartTime;
	}

	public void setStartTime(int startTime) {
		StartTime = startTime;
	}

	public int getEndTime() {
		return EndTime;
	}

	public void setEndTime(int endTime) {
		EndTime = endTime;
	}

	public StudentPreferences(String type, String day, int sTime, int eTime) {
		Type = type; //Unable, prefer, would like
		Day = day;
		StartTime = sTime;
		EndTime = eTime;
	}
	public StudentPreferences() {
		
	}
	

}
