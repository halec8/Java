import java.util.Random;
import java.util.Scanner;

public class GuessingGameLoop {

	public static void main(String[] args) {
		Random rand = new Random(); // begin the Random Number Generator
		final int MAX = 10; // constant to define the MAX random number value
		final int MIN = 1;  // constant to define the MIN random number value
		int randomNumber =  rand.nextInt(MAX) + MIN;   // variable to store the random number 
		
		int userGuess = 0;                   // variable for user guess
		Scanner in = new Scanner(System.in); // prepare for user input
		int i = 0;
		
        // add loop here
		while(i<10)
		{
			// get guess from user
			// 1. prompt user
			System.out.println("Please guess a random number between " + MIN + " and " + MAX);
			// 2. read input and store in variable
			userGuess = in.nextInt();
			
			if (userGuess == randomNumber){
				System.out.println("Great Guess! You got it right!");
			} else {
				System.out.println("Sorry! That's not the number.");
				i++;
			}
		}
        // end loop
			
	}
}
