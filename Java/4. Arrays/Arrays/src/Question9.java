import java.util.Arrays;

public class Question9 {

    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(A)));;
    }

    public static int[] reverseArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[arr.length - i - 1] = arr[i];
        }
        return newArray;
    }

}
