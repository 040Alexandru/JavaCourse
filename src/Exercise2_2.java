import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Välj första talet:");
  int firstNumber = input.nextInt();
        System.out.println("Välj andra talet:");
        int secondNumber = input.nextInt();
        System.out.println("Summan av talen är:");
        System.out.println(firstNumber + secondNumber);
        System.out.println("Produkten av talen är:");
        System.out.println(firstNumber * secondNumber);
        System.out.println("Genomsnittet av talen är:");
        System.out.println((firstNumber + secondNumber) / 2.0);
    }
}
