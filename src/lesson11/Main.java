package lesson11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //10 Compound interest calculator

        double principal;
        double rate;
        int years;
        int timesCompounded;
        double interest;
        double amount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Compound Interest Calculator\n");

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate(in%): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter # times compound per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        //calculation
        amount = principal * Math.pow((1 + (rate/timesCompounded)) ,timesCompounded * years);
        interest = amount - principal;
        //display

        System.out.printf("\nThe amount is: $%.2f", amount);
        System.out.printf("\nThe interest is: $%.2f", interest);

        scanner.close();
    }
}
