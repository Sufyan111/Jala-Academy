public class Question1 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(sumArray(A));;
    }
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
