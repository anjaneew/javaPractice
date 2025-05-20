package lesson4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //MadLibs Game
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String verb1;
        String noun1;

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("\n--------------Game of MadLibs--------------");
        System.out.println("Today I went to a "+ adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was "+ adjective3 + "!");

        scanner.close();
    }
}
