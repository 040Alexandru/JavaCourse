import java.util.Scanner;

public class Exercise5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNr = 420;
        int attempts = 0;
        int guess = 0;

        while (guess != secretNr) {
            System.out.println("Guess a number between 1 and 1000:");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secretNr) {
                System.out.println("Too low, try again!");
            } else if (guess > secretNr) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Congratulations! You guessed right on: " + attempts + " attempts");
            }

        }
    }
}
