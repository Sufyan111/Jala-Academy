import java.util.Arrays;

public class Question13 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 9, 6 };

        System.out.println("Second Largest: " + findSecondLargest(arr1));
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

}
