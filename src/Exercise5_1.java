public class Exercise5_1 {
    public static void main(String[] args){
        //Nedräkning:
      System.out.println("Jag kan räkna från 1 till 10:");
        for (int a = 1; a <= 10; a++){
          System.out.println(a);
        }
          System.out.println(); //Mellanrum
        //Räkna upp:
          System.out.println("Och jag kan räkna ner från 10 till 1:");
        for (int b = 10; b >= 1; b--){
          System.out.println(b);
        }

       System.out.println();

       //Räkna jämnt
        System.out.println("Jag räknar jämnt till 20:");
           for (int evenNr = 0; evenNr <= 20; evenNr += 2){
            System.out.println(evenNr);
        }
       //Summerar tal
           int sum = 0;
           for (int i = 1; i <= 100; i++) {
               sum += i;
           }
           System.out.println();
             System.out.println("Summan av alla tal från 1 till 100 är: " + sum);
    }
}
