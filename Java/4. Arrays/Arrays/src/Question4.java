public class Question4 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(containsValue(A,4));;
    }

    public static boolean containsValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
