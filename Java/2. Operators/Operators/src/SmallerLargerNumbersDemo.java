import java.util.Scanner;

public class SmallerLargerNumbersDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compare the two numbers
        if (num1 < num2) {
            System.out.println("The smaller number is: " + num1);
            System.out.println("The larger number is: " + num2);
        } else if (num1 > num2) {
            System.out.println("The smaller number is: " + num2);
            System.out.println("The larger number is: " + num1);
        } else {
            System.out.println("The two numbers are equal.");
        }

    }

}
