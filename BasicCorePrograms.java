import java.util.*;

public class BasicCorePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get input of alphabet from user
        System.out.println("Enter the alphabet");
        char ch = sc.next().charAt(0);

        // check input is equal to a,e,i,o,u
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}

