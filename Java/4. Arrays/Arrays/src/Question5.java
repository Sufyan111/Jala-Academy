import java.util.Arrays;

public class Question5 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeElement(A, 4)));;
    }

    public static int[] removeElement(int[] arr, int value) {
        int index = Question3.findIndex(arr, value);
        if (index != -1) {
            int[] newArray = new int[arr.length - 1];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i != index) {
                    newArray[j] = arr[i];
                    j++;
                }
            }
            return newArray;
        } else {
            return arr;
        }
    }

}
