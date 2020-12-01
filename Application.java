import jade.core.*;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;


public class Application {
	public static void main(String[] args) {
		///Types of agent "Unable", "Prefer Not", "Neutral", "Would Like"
		Profile myProfile = new ProfileImpl();
		Runtime myRuntime = Runtime.instance();
		ContainerController myContainer = myRuntime.createMainContainer(myProfile);	
		try{
			AgentController rma = myContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
			rma.start();
			
			//Tutorial tut = new Tutorial("SEM", "Tuesday", 1300, 1400);
			StudentPreferences prefA = new StudentPreferences("Unable", "Tuesday", 1200, 1700);
			StudentPreferences[] preferencesA = {prefA};
			
			StudentPreferences prefB = new StudentPreferences("Unable", "Friday", 1100, 1700);
			StudentPreferences[] preferencesB = {prefB};
			
			AgentController TimetableAgent = myContainer.createNewAgent("Timetabler", TimetablingAgent.class.getCanonicalName(), null);
			TimetableAgent.start();
			
			AgentController StudentA = myContainer.createNewAgent("StudentA", StudentAgent.class.getCanonicalName(), preferencesA);
			StudentA.start();
			
			AgentController StudentB = myContainer.createNewAgent("StudentB", StudentAgent.class.getCanonicalName(), preferencesB);
			StudentB.start();

		}
		catch(Exception e){
			System.out.println("Exception starting agent: " + e.toString());
		}
	}

}
