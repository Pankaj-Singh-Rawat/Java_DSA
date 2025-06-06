package TrashCode;

public class MaxItemArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr , 4, 5));

    }
//    imagine that array is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal ;
    }

    //maximum number in a range inside array
    static int maxRange(int[] arr , int start , int end) {
        int maxVal = arr[start];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
