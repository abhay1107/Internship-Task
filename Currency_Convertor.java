import java. util.Scanner;

/**
 * CurrencyConverter
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        // take input
        Scanner sc = new Scanner(System.in);
        System. out.println("Currency Convertor by ABHAY VERMA");
        System. out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        // convert the amount
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Ruppe_to_other(double amt) {
    System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
    System.out.println();

    System.out.println(amt+" Ruppe = " + (amt*0.011) + " Euro");
    System.out.println();

}
    

public static void Dollar_to_other(double amt) {
   
    System.out.println(amt+" Dollar = " + (amt*82.86) + " Ruppe");
    System.out.println();


    System.out.println(amt+" Dollar = " + (amt*0.92) + " Euro");
}

    

public static void Euro_to_other(double amt){
   
    System.out.println(amt+" Euro = " + (amt*90.14) + " Ruppe");
    System.out.println();


    System.out.println(amt+" Euro = " + (amt*1.09) + " Dollar");
}
}