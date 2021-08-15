import java.util.Random;

public class RandomNumber_WhileLopp {

	public static void main(String[] args) {
		Random rand = new Random(); // begin the Random Number Generator
		final int MAX = 10; // constant to define the MAX random number value
		final int MIN = 1;  // constant to define the MIN random number value
		int randomNumber = 0;   // variable to store and display the random number 
		int i = 0; // initialize and index

        // add loop here
		while(i < 10)
		{
			randomNumber = rand.nextInt(MAX) + MIN;	 // get the next random number and store it
			System.out.println(randomNumber);       
			i ++; // output the random number
		}
        // end loop
	}
}