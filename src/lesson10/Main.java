package lesson10;

public class Main {
    public static void main(String[] args){

        //Printf statements
        //%[flags][width][.precision][specifier-character]

        String name = "Luminara";
        char currency = '$';
        int candidate = 10;
        double salary = 1999.99;
        boolean isHired = true;

        double price1 = 19.9;
        double price2 = 9.99;
        double price3 = -54.0152;

        int id1 = 0011;
        int id2 = 179;
        int id3 = 001;

        System.out.println("\nPrintf statements\n");
        // Flags %s %c %d %f %b
        System.out.println("Flags %s %c %d %f %b\n");
        System.out.printf("Dear %s,\nwe confirm that you are one of the top %d candidates in our selection.\nYour hiring status is %b \nand we offer you %c %.2f\n\n", name, candidate, isHired, currency, salary);

        //width
        System.out.println("width %.2f\n");
        System.out.printf("The price list is handbag A is $%.2f, \nhandbag B is $%.2f and \nhandbag C is at $%.2f\n\n", price1, price2, price3 );

        // 0 = zero padding
        // positive number = right justified padding
        // negative number = left justified padding
        System.out.println("\nzero padding with number %04d\n");
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        //negative numbers
        System.out.println("\nnegative number %-4d\n");
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);

    }
}
