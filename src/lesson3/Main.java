package lesson3;
//User Input

//import Scanner package
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //create new Scanner object
        Scanner scanner = new Scanner(System.in);

        //user prompt
        System.out.println("Enter your name:");
        String name = scanner.nextLine();//include any spaces

        System.out.println("Enter your nickname:");
        String nickname = scanner.next();//no spaces
        scanner.nextLine();

        System.out.print("Enter your age:");//println X
        int age = scanner.nextInt();

        System.out.print("Enter your gpa:");//println X
        double gpa = scanner.nextDouble(); // D not d

        System.out.print("Are you a student? (true/false): ");//better with print
        boolean isStudent = scanner.nextBoolean();//B not b

        System.out.println("Hello!" + name +  " your username is: " + nickname + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa + ".");

//        System.out.println("You are enrolled in studies: " + isStudent);
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }


        //Common issues
        //int/double then Sting
        System.out.print("Enter your room number :");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();//clear input buffer

        System.out.println("Enter your favourite color");
        String color = scanner.nextLine();

        System.out.println("Your room number is " + roomNumber +".");
        System.out.println("Your favourite color is " + color +".");


//        //calculate the area of a rectangle
//        System.out.print("Enter the width :");
//        double width = scanner.nextDouble();
//
//        System.out.print("Enter the height :");
//        double height = scanner.nextDouble();
//
//        double area = width * height;
//        System.out.println("The are of your rectangle is : " + area);

        //if you open one you must close too
        scanner.close();



    }
}
