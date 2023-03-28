public class Question15 {

    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5, 8, 8};
        findEvenOddCount(A);
    }

    public static void findEvenOddCount(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements in the array: " + evenCount);
        System.out.println("Number of odd elements in the array: " + oddCount);
    }

}
