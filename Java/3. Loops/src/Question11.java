import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch (num % 2) {
            case 0 -> System.out.println(num + " is even");
            case 1 -> System.out.println(num + " is odd");
            default -> System.out.println(num + " is not a valid number");
        }
    }
}
