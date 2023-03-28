public class Question10 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5, 8, 8};
        findDuplicates(A);
    }
    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate value: " + arr[i]);
                }
            }
        }
    }


}
