import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question18 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 9, 6 };

        int[] commonValues = removeDuplicates(arr1);

        System.out.println("Unique Values: " + Arrays.toString(commonValues));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        int[] newArray = new int[set.size()];
        int index = 0;
        for(int element : set) {
            newArray[index++] = element;
        }
        return newArray;
    }

}
