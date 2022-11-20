import java.util.*;

public class BasicCorePrograms {
    public static void main(String[] args) {
        //Taking input year from user
        System.out.println("Input year to check leap year or not");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //Checking conditions for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year +" is leap year");
        } else {
            System.out.println(year +" is not a leap year");
        }
    }
}
