import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final int MAX_NUMBER = 100;
    private static int secretNumber;
    private static int numGuesses;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        secretNumber = random.nextInt(MAX_NUMBER) + 1;
        numGuesses = 0;

        System.out.println("I'm thinking of a number between 1 and " + MAX_NUMBER + ".");
        System.out.println("Can you guess what it is?");

        while (true) {
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the secret number in " + numGuesses + " guesses.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}