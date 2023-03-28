public class Question16 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 9, 6 };

        System.out.println("Difference: " + getDifferenceOfLargestAndSmallest(arr1));
    }

    public static int getDifferenceOfLargestAndSmallest(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest - smallest;
    }

}
