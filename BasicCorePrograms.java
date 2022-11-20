import java.util.*;

public class BasicCorePrograms {
    public static void main(String[] args) {

        // Get Dividend and Divisor input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int dividend = sc.nextInt();

        System.out.println("Enter the Dividend");
        int divisor = sc.nextInt();

        // Computing Process
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}

