package lesson8;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        //Random Number
        Random random = new Random();

        int diceRoll = random.nextInt(1,7);
        int parlimentMember = random.nextInt(1,160);
        double number = random.nextDouble();
        //my way
        double price = Math.ceil((random.nextDouble())*100);
        boolean isHead = random.nextBoolean();

        System.out.println(diceRoll);
        System.out.println(parlimentMember);
        System.out.println(number);
        System.out.println(price);

        if(isHead){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
