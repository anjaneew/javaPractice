package lesson12;

public class Main {
    public static void main(String[] args){

        //12 Nested if statements

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){

            if(isSenior){
                System.out.println("You are a student. You get a student discount of 10%.");
                System.out.println("You are a senior. You get a senior discount of 20%.");
                price *= 0.7;
            }else{
                System.out.println("You are a student. You get a student discount of 10%.");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You are a senior. You get a senior discount of 20%.");
                price *= 0.8;
            }else{
                price *= 1;
            }
        }

        System.out.printf("Your ticket price is %.2f", price);
    }
}
