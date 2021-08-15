import java.util.Scanner;


public class Determine_LeapYear {
	
	
	// creates a boolean value that will be used to end the loop
	static boolean isLeapYear = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declares a local variable to store the entered year
		int year;
	
			
		// starts the while loop, if the leapYear ins't true then the loop continues. If it is true
		// then the loop ends
		while (isLeapYear != true)
		{
			
			
			// Prompts the user to enter a year and initializes a scanner that will store the entered value
			// in the year variable
			System.out.println("Enter a Year");
			Scanner sc = new Scanner(System.in);
			year = sc.nextInt();
			
			
			/* beginning of the if statement says if the year is evenly divisible by 4, 100 and 400 
			 then it is a leap year. If not then it isn't a leap year
			 */
			 
			if(((year % 4 == 0) && (year % 100!=0) || year%400 == 0))
			{
				
				// Prints a string that states the user did specify a leap year
				System.out.println("The specified year you entered is indeed a leap year!");
				
				// boolean is set to true since it is a leap year and the loop ends.
				isLeapYear = true;
			
			}
			else 
			{
				/* creates two strings that are printed. Ones states that the year specified isn't
				 * a leap year and the other is a blank string for formatting purposes.
				 */
				
				System.out.println("The specificed year you entered is not a leap year");
				System.out.println("");
				
				/* the boolean is set to false and the loop continues until the user selects a valid 
				 * leap year
				 */
				isLeapYear = false;
				
			}
			
		}
	}
}
