package Java_DSA;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        // search from index 1 to 6 : target_value = 10

        int target = 3 ;

        System.out.println(search(arr , 1 , 4, target));
    }

    static int search(int[] arr , int start , int end , int target){
        for (int i = start; i <= end ; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
