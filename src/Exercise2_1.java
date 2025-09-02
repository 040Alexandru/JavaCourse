import java.util.Scanner;
public class Exercise2_1 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Vad heter du?");
    String name = input.nextLine();
    System.out.println("Hur gammal är du?");
    int age = input.nextInt();
    input.nextLine(); // Tar bort Enter
    System.out.print("Var bor du?");
    String city = input.nextLine();

    System.out.println("Hej. Jag heter " + name + ".");
    System.out.println("Jag är " + age + " år gammal och bor i " + city + " stad.");

}
}
