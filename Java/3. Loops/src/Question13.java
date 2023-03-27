public class Question13 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        System.out.println("The largest number is " + largest);
    }
}
