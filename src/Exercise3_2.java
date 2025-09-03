import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur många poäng fick du på provet?");
        int score = input.nextInt();
        if (score < 0 || score > 100) {
        } else if (score >= 90) {
        System.out.println("Grattis! Du fick A på provet!");
        } else if (score >= 80) {
            System.out.println("Bra jobbat! Du fick B på provet!");
        } else if (score >= 70) {
            System.out.println("Helt ok! Du fick C på provet!");
        } else if (score >= 60) {
            System.out.println("Kom igen! Du fick D på provet! Du kan bättre!");
        } else {
            System.out.println("Skärpning!! Du fick F och totalt underkänt på provet!");
        }
    }
}