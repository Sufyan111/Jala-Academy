public class Question14 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 9, 6 };

        System.out.println("Second Smallest: " + findSecondSmallest(arr1));
    }

    public static int findSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return secondMin;
    }

}
