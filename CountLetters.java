/*
	This program will read a line from the user and returns the number of letters
	that exists in the input.

	Author: Nate Lao
*/
import java.util.Scanner; //Import the Scanner class

public class CountLetters {

	/* Main Driver */
	public static void main(String[] a) {
		int numLetters;	//The number of characters the input will have
		String line;	//Variable for the input line
		Scanner input = new Scanner(System.in); // Declare and initialize a Scanner object

		System.out.println("Type a message:"); //Message prompt
		line = input.next();	//User inputs a line
		numLetters = countLetters(line); //Call counting method on the String

		//Output prompt
		System.out.print("This line contains ");
		if (numLetters > 0) {
			System.out.print(numLetters);
			if (numLetters > 1) {
				System.out.println(" letters.");
			} else {
				System.out.println(" letter.");
			}
		} else {
			System.out.println(" no letters.");
		}
	}

	/*
		Returns the number of letter characters there are in
		the String 'input'.
	*/
	private static int countLetters(String input) {
		int length = input.length(); //Length of the String
		int index = 0; //Index of the String
		int numLetters = 0; //Tallys the number of letters in the String

		while (index < length) {
			//If the character at the current index is a letter, increment tally
			if (Character.isLetter(input.charAt(index))) {
				numLetters++;
			}

			index++; //Increment index
		}

		return numLetters;
	}
}