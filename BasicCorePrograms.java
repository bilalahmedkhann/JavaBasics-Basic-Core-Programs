import java.util.*;

public class BasicCorePrograms {
    public static void main(String[] args) {
        //declaration
        int head = 0;
        int tail = 0;

        // Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of time to flip the coin");
        int num = sc.nextInt();

        // check  the condition
        for (int i = 1; i <= num; i++) {
            double a = Math.random();
            if (a < 0.5) {
                tail++;
            } else {
                head++;
            }
        }
        System.out.println("Head = " + head);
        System.out.println("Tail = " + tail);

        // Calculating Percentage for Head and Tail
        int headPercent = (head * 100) / num;
        int tailPercent = (tail * 100) / num;

        System.out.println("HeadPercentage = " + headPercent + "%");
        System.out.println("TailPercentage = " + tailPercent + "%");
    }
}