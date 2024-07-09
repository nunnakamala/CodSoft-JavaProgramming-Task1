package Tasks;
import java.util.Random;
import java.util.Scanner;
public class NumberGame {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	     // Maximum number of attempts per round
	        int maxAttempts = 10; 
	        boolean playAgain = true;
	        int totalScore = 0;
	        while (playAgain) {
	        	// Random number between 1 and 100
	            int randomNumber = random.nextInt(100) + 1; 
	            int attempts = 0;
	            boolean hasGuessedCorrectly = false;
	            System.out.println("Welcome to the Number Guessing Game!");
	            System.out.println("I have generated a number between 1 and 100. Try to guess it!");
	            System.out.println("You have " + maxAttempts + " attempts to guess the number.");
	            while (attempts < maxAttempts && !hasGuessedCorrectly) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;
	                if (userGuess < randomNumber) {
	                    System.out.println("Too low! Try again.");
	                } 
	                else if (userGuess > randomNumber) {
	                    System.out.println("Too high! Try again.");
	                } 
	                else {
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                    hasGuessedCorrectly = true;
	                 // Score based on remaining attempts
	                    totalScore += maxAttempts - attempts + 1; 
	                }
	            }

	            if (!hasGuessedCorrectly) {
	                System.out.println("Sorry! You've used all " + maxAttempts + " attempts. The correct number was " + randomNumber + ".");
	            }

	            System.out.println("Your current score: " + totalScore);
	            System.out.print("Do you want to play another round? (yes/no): ");
	            scanner.nextLine(); 
	            String response = scanner.nextLine().trim().toLowerCase();
	            if (!response.equals("yes")) {
	                playAgain = false;
	                System.out.println("Thank you for playing! Your final score is: " + totalScore);
	            }
	        }

	        scanner.close();
	    }
	}
