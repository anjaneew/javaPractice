package lesson9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Math

        Scanner scanner = new Scanner(System.in);

        System.out.println("PI is :"+ Math.PI);
        System.out.println("Euler's number is :"+ Math.E);

        double result;
        int max;
        int min;

        result = Math.pow(2,3);//base to the power 8.0
        result = Math.sqrt(9);//3.0
        result = Math.abs(-5);//5.0
        result = Math.round(3.14);//3.0
        result = Math.ceil(3.14);//4.0
        result = Math.floor(3.14);//3.0

        max = Math.max(12,15);
        min = Math.min(12,15);

        System.out.println("\nThe result is " + result);
        System.out.println("\nThe maximum number: "+ max);
        System.out.println("The minimum number: "+ min);

        //-----Exercise 1 -------
        //Hypotenuse c = squareroot(a² + b²)

        double a;
        double b;
        double c;

        System.out.print("Exercise 1 -- Calculate Hypotenuse");
        System.out.print("\nEnter the length of side a: ");
        a = scanner.nextDouble();
        System.out.print("The side a is " + a + "cm");
        System.out.print("\nEnter the length of the side b: ");
        b = scanner.nextDouble();
        System.out.println("The side b is " + b + "cm");

        c = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        System.out.println("\nHypotenuse (side c): " + c + "cm");

        //-----Exercise 2 -------
        //circumference = 2 * PI * radius;
        //area = PI * radius²;
        //volume = (4/3) * PI * radius³;

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("\nExercise 2 -- Calculations in circles");
        System.out.print("Enter the radius of a circle :" );
        radius = scanner.nextDouble();
        System.out.print("The radius is " + radius+ "cm");

        //calculation time
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("\nThe circumference: %.1fcm", circumference);
        System.out.printf("\nThe area: %.1fcm²", area );
        System.out.printf("\nThe volume: %.1fcm³", volume );

        scanner.close();
    }

}
