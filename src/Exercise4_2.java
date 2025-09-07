import java.util.Scanner;
public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vad kostar varan?");
        double pris = input.nextDouble();
        input.nextLine();

        System.out.println("Är du student?");
        String studentSvar = input.nextLine();

        System.out.println("Är du medlem?");
        String medlemSvar = input.nextLine();

        boolean isStudent = studentSvar.equalsIgnoreCase("ja");
        boolean isMedlem = medlemSvar.equalsIgnoreCase("ja");

        double rabattProcent = 0;
        if (isStudent && isMedlem){
            rabattProcent = 15;
        } else if (isStudent){
            rabattProcent = 10;
        } else if (isMedlem){
            rabattProcent = 5;
        } else rabattProcent = 0;

        double rabattBelopp = pris * rabattProcent / 100.0;
        double slutPris = pris - rabattBelopp;

        System.out.println("Originalpris: " + (int) pris + " kr");
        System.out.println("Rabatt: " + (int) rabattBelopp + " kr");
        System.out.println("Slutpris: " + (int) slutPris + " kr");
    }
}