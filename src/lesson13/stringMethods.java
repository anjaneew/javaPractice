package lesson13;
import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args){

        //--------String Methods-----------
        String name1 = "Baba boya";

        System.out.println("---Basic String Methods --");

        int length = name1.length();
        System.out.println(length);//9

        char letter = name1.charAt(0);
        System.out.println(letter);//B

        int index = name1.indexOf("a");
        System.out.println(index);//1
        int space = name1.indexOf(" ");
        System.out.println(space);//4
        int lastIndex = name1.lastIndexOf("a");
        System.out.println(lastIndex);//8

        String upperName = name1.toUpperCase();
        System.out.println(upperName);//BABA BOYA
        String lowerName = name1.toLowerCase();
        System.out.println(lowerName);//baba boya


        String name2 = "  Baba boya    ";
        name2 = name2.trim();
        System.out.println(name2);//Baba boya
        name2 = name2.replace("a","i");
        System.out.println(name2 + "\n");//Bibi boyi

        //-----------Advance String Methods-----------

        Scanner scanner = new Scanner(System.in);

        String username;
        String storedPassword = "12345";
        String password;

        System.out.println("\n---Log in program --");

        System.out.print("\nEnter your username: ");
        username = scanner.nextLine();

        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        if(username.isEmpty()){
            System.out.println("\nYou did not enter a username.");
        } else if(username.contains(" ")){
            System.out.println("\nYour username cannot have spaces.");
        } else{
            System.out.println("\nHello "+ username);
        }

        if(password.isEmpty()){
            System.out.println("You did not enter a password.");
        } else if(password.equals(storedPassword)){
            System.out.println("You are logged in.");
        } else{
            System.out.println("The password did not match.");
        }

        scanner.close();

    }

}
