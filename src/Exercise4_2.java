import java.util.Scanner;
public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vad kostar varan?");
        double vara = input.nextDouble();
        System.out.println("Är du student?");
        boolean student = true;
        String studentSvar = input.nextLine();
        System.out.println("Är du medlem?");
        boolean medlem = true;
        String medlemSvar = input.nextLine();
        }
}
