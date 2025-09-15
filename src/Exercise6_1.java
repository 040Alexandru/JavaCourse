import java.util.Scanner;
public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean active = true;
        while (active) {
            System.out.println("Välj ett av nedan alternativ:");
            System.out.println("Räkna ut area av en rektangel. Välj 1.");
            System.out.println("Räkna ut area av en cirkel. Välj 2.");
            System.out.println("Avsluta. Välj 3.");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Vad är längden på rektangeln?");
                    int lengthRektangel = scanner.nextInt();
                    System.out.println("Vad är bredden på rektangeln?");
                    int breddRektangel = scanner.nextInt();
                    System.out.println("Arean av en rektangel är: " + lengthRektangel * breddRektangel);
                    break;
                case 2:
                    System.out.println("Vad är radien på cirkeln?");
                    double radieCirkel = scanner.nextInt();
                    System.out.println("Arean på cirkeln är: " + radieCirkel * radieCirkel * 3.14);
                    break;
                case 3:
                    System.out.println("Avslutar programmet.");
                    active = false;

            }
        }
    }
}