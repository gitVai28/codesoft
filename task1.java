import java.util.*;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerLimit = 1;
        int upperLimit = 100;
        int numberOfAttempts = 7;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + lowerLimit + " and " + upperLimit);

        do {
            int targetNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            int userGuess;
            boolean correctGuess = false;

            for (int attempts = 1; attempts <= numberOfAttempts; attempts++) {
                System.out.print("Enter your guess (Attempt " + attempts + "): ");
                userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    correctGuess = true;
                    score += numberOfAttempts - (attempts - 1);
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!correctGuess) {
                System.out.println("Sorry! your attempts are over. The correct number was: " + targetNumber);
            }

            rounds++;
            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        System.out.println("Rounds played: " + rounds);
        System.out.println("Total Score: " + score);
    }
}
