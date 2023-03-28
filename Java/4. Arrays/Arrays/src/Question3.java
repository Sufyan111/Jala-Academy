public class Question3 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(findIndex(A, 4));;
    }

    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
