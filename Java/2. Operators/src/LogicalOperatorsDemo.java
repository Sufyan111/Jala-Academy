public class LogicalOperatorsDemo {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = -30;

        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive.");
        } else {
            System.out.println("At least one number is not positive.");
        }

        if (num1 > 0 || num3 > 0) {
            System.out.println("At least one number is positive.");
        } else {
            System.out.println("Both numbers are not positive.");
        }

        boolean flag = true;

        if (!flag) {
            System.out.println("The flag is false.");
        } else {
            System.out.println("The flag is true.");
        }


    }
}
