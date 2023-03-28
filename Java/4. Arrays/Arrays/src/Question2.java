public class Question2 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(averageArray(A));;
    }
    public static double averageArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
