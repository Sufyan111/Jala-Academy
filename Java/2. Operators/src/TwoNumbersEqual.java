import java.util.Scanner;

public class TwoNumbersEqual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("The two numbers are equal.");
        } else {
            System.out.println("The two numbers are not equal.");
        }

        scanner.close();

    }

}

