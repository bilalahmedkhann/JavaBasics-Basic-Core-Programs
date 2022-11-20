import java.util.*;

public class BasicCorePrograms {
    public static void main(String[] args) {

        int temp;
        Scanner sc=new Scanner(System.in);

        // Get user input of A and B
        System.out.println("Enter A value");
        int a=sc.nextInt();
        System.out.println("Enter B value");
        int b=sc.nextInt();

        // Before swapping the numbers
        System.out.println("Before Swapping the Numbers ");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        // swapping process
        temp=a;
        a=b;
        b=temp;

        // After swapping the numbers
        System.out.println("After Swapping the Numbers ");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}

