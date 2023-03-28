import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question12 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 9, 6 };

        int[] commonValues = removeDuplicates(arr1);

        System.out.println("Unique Values: " + Arrays.toString(commonValues));
    }
    public static  int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
