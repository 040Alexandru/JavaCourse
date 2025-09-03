import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hur gammal är du?");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Grattis! Du får köra bil.");
        } else {
            System.out.println("Tyvärr! Du får inte köra bil!");
        }
        if (age >= 20){
            System.out.println("Grattis! Du får både köpa alkohol och handla på Systembolaget!");
        } else {
            System.out.println("Tyvärr får du varken handla alkohol eller på Systembolaget.");
        }
        if (age >= 65){
            System.out.println("Dessvärre är du också en pensionär.");
        } else {
            System.out.println("Men än är du inte pensionär!");
        }
        }
    }