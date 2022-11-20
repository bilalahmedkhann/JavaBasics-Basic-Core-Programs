import java.util.*;

public class BasicCorePrograms {
    public static void main(String[] args) {
        // Get input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power of 2");
        int N = sc.nextInt();
        int num = 1;

        //Condition to get power of 2
        for (int i = 1; i <= N; i++) {
            if (N < 31) {
                num = 2 * num;
            }
        }
        System.out.println(num);
    }
}

