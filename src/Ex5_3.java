import java.util.Scanner;

public class Ex5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hemligtTal = 42;
        int gissningar = 0;
        int försök = 0;

        while (gissningar != hemligtTal) {
            System.out.println("Gissa ett tal mellan 1 till 100:");
            gissningar = scanner.nextInt();
            försök++;

            if (gissningar < hemligtTal) {
                System.out.println("För lågt!");
            } else if (gissningar > hemligtTal) {
                System.out.println("För högt!");
            } else {
                System.out.println("Grattis, du gissade rätt på " + försök + " försök!");
            }
        }
    }
}