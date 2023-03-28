import java.util.Arrays;

public class Question7 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(insertElement(A,6,5)));;
    }
    public static int[] insertElement(int[] arr, int value, int index) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = value;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = arr[i - 1];
        }
        return newArray;
    }

}
