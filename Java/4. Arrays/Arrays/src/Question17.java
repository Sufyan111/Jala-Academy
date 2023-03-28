public class Question17 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 9, 6 };

        System.out.println("Contains: " + containsTwoSpecifiedElements(arr1, 1 , 9));
    }


    public static boolean containsTwoSpecifiedElements(int[] arr, int element1, int element2) {
        boolean containsElement1 = false;
        boolean containsElement2 = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == element1) {
                containsElement1 = true;
            }
            if(arr[i] == element2) {
                containsElement2 = true;
            }
        }
        return containsElement1 && containsElement2;
    }

}
