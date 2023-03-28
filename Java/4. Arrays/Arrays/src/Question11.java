import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        int[] commonValues = findCommonValues(arr1, arr2);

        System.out.println("Common Values: " + Arrays.toString(commonValues));
    }

    public static int[] findCommonValues(int[] arr1, int[] arr2) {
        int[] commonValues = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    commonValues[index] = arr1[i];
                    index++;
                    break;
                }
            }
        }

        return Arrays.copyOf(commonValues, index);
    }
}
