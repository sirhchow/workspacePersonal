package numberguess;

import java.util.*;

public class Main {

	public static void intro() {

		System.out.println("Welcome to Number Guess");
		System.out.println("Please guess a whole number from 1 to 10");
	}

	public static int getGuess(Scanner console) {

		while (!console.hasNextInt()) {
			System.out.println("Not a whole number; try again");
			console.next();
		}
		return console.nextInt();
	}

	public static void Guess(int guess, int number, Scanner console,
			int numGuesses) {

		while (guess != number) {
			System.out.println("You are incorrect");
			System.out.println("Please try again");
			guess = getGuess(console);
			numGuesses++;
		}

		System.out.println("Congratulations you are correct");
		System.out.println("Number of tries= " + numGuesses);

	}

	public static void main(String[] args) {

		intro();

		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(10) + 1;
		int guess = getGuess(console);
		int numGuesses = 1;

		Guess(guess, number, console, numGuesses);
	}
}