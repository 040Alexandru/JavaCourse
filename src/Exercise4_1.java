import java.util.Scanner;

public class Exercise4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ange användarnamn:");
        String användarNamn = input.nextLine();
        System.out.println("Ange lösenord:");
        String lösenOrd = input.nextLine();
        if (användarNamn.equals("admin") && lösenOrd.equals("password123"))
            System.out.println("Välkommen Admin!");
        else {
            System.out.println("Fel användarnamn eller lösenord!");
        }
    }
}