
public class HoursSpentSleeping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String returnHours;
		String myName = "My first name is Cody ";
		String hoursSlept = " and I generally sleep 5 hours a night.";
		
		returnHours(myName, hoursSlept);

	}
	
	
	public static String returnHours(String myName, String hoursSlept)
	{
		
	
		String returnHours;
	
		returnHours = myName + hoursSlept;
		
		System.out.println(returnHours);
		
		return returnHours;
		
	}
	
}
