import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // Print even numbers
        System.out.println("Even numbers:");
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Print odd numbers
        System.out.println("Odd numbers:");
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
