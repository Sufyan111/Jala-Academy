import java.util.Arrays;

public class Question6 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(copyArray(A)));;
    }

    public static int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
