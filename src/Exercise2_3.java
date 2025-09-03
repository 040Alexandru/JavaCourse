import java.util.Scanner;

public class Exercise2_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Välj det belopp du vill konvertera i SEK:");
        double numberSek = input.nextInt();
        double eur = numberSek * 0.085;
        double usd = numberSek * 0.091;
        System.out.println("Ditt belopp i EUR är: " + eur);
        System.out.println("Ditt belopp i USD är: " + usd);
    }
}
