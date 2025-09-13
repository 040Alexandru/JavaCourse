import java.util.Scanner;

public class Exercise5_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilket tal vill du ha multiplikationstabellen för?");
        int tal = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            int result = tal * i;
            System.out.println(tal + " x " + i + " = " + result);
        }
    }
}
