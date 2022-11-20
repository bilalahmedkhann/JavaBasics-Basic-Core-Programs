import java.util.*;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Get input from user
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        // process to check even and odd
        if (num % 2 ==0) {
            System.out.println("Given Number is even");
        }
        else
            System.out.println("Given Number is odd");
    }
}

