package TrashCode;

public class FindMaxNum {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(max(arr));
    }

    static int max( int[] arr ){
        int max = arr[0] ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }
}
