public class Question19 {

    public static void main(String[] args){
        int[] arr = new int[100];
        for(int i = 1; i <= 100; i++){
            if(i != 78)
                arr[i-1] = i;
        }
        System.out.println(findMissingNumber(arr));
    }
    public static int findMissingNumber(int[] arr) {
        int expectedSum = (1 + 100) * 100 / 2;
        int actualSum = 0;
        for(int i=0; i<arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

}
