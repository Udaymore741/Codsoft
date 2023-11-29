import java.util.Scanner;
import java.util.Random;

public class Codsoft_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int attempts = 10;
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.println("I am thinking of a number between " + min + " and " + max + ". You have " + attempts + " attempts to guess it.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                    score += i;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (i == attempts) {
                    System.out.println("Sorry, you have used up all your attempts. The number was " + randomNumber + ".");
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgainInput = input.next();

            if (playAgainInput.equalsIgnoreCase("n")) {
                playAgain = false;
            }
        }

        System.out.println("Your score is " + score + ".");
    }
}
