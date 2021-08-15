import java.util.Random;

public class RandomNumber_ForLoopImplementation {

	public static void main(String[] args) {
		Random rand = new Random(); // begin the Random Number Generator
		final int MAX = 10; // constant to define the MAX random number value
		final int MIN = 1;  // constant to define the MIN random number value
		int randomNumber;   // variable to store and display the random number 
		

        // add loop here
	      for(int index = 0; index <= 100; index++)
	      {
			randomNumber = rand.nextInt(MAX) + MIN;	 // get the next random number and store it
			System.out.println(randomNumber);   
	      }// output the random number
        // end loop
	}
}