import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        int n = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
