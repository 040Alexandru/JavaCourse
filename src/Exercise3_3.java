import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hur varmt är det ute idag?");
        double temperature = input.nextInt();
        if (temperature < 0) {
            System.out.println("Ta på dig vinterjacka!");
        } else if (temperature >= 0 && temperature <= 10) {
            System.out.println("Klä dig varmt!");
        } else if (temperature > 10 && temperature <= 20) {
            System.out.println("Perfekt väder för en hoodie!");
        } else if (temperature >= 20) {
            System.out.println("Shorts-väder!");
        }
    }
}
