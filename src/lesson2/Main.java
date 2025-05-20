package lesson2;
//Variables

public class Main {
    public static void main(String[] args){

        //Variables

        /*
        Variables               = Primitive            VS   Reference
        reusable code container   simple value              memory address (stack)
                                  in memory(stack)          that points to (heap)

                                  int                       string
                                  double                    array
                                  char                      object
                                  boolean
        */

        /*
        Creating a variable
            1. declaration  int age;
            2. assignment
         */

        // together

        //integer
        int age = 21;
        int year = 2025;
        int quantity = 1;
        System.out.println(age);
        System.out.println(year);
        System.out.println(quantity);

        System.out.println("The year is " + year);

        //double
        double price = 19.99;
        double gpa = 3.2;
        double temperature = -12.5;

        System.out.println("$"+price + " my gpa is "+ gpa);
        //even if double is 19 it will print as 19.0
        System.out.println("The temperature is " + temperature);


        //char
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("My grade is "+ grade + ".\nWHY "+ symbol +
                ".\nThe currency is "+ currency);

        //boolean
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);

        if(isOnline){
            System.out.println("The user is online.");
        }
        else{
            System.out.println("The user is not online.");
        }

        //String
        String name = "Anjanee";
        String food = "cashew";
        String email = "bookwarm@gmail.com";
        String car = "Maclaren";

        System.out.println("My name is "+ name);
        System.out.println("my choice is " + year + " " + car);

        //homework
        String hobby = "watching movies";
        int count = 15;
        double bankBalance = 19.09;
        char degreeSymbol = '°';
        boolean isEmployed = false;
    }
}
