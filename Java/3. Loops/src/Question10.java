import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;

        // Reverse the number
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        // Check if the reversed number is equal to the original number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number");
        } else {
            System.out.println(originalNumber + " is not a palindrome number");
        }
    }
}
