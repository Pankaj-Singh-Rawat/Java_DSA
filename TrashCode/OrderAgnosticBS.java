package Java_DSA;

public class OrderAgnosticBS {
    public static void main(String[] args) {

//        int[] arr = {1, 5, 20, 35, 66, 77, 92};
        int[] arr = {99, 88, 77, 55, 33, 22, 11, 1};
        int target = 88;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    //find whether the array is sorted in ascending or descending


    static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        isAsc = arr[start] < arr[end];


        while(start <= end){
            // find the middle element
//            int mid = (s + e)/2;
            // better way to find mid
            int mid = start + (end - start) / 2; // for data longer than the int range

            if (arr[mid] == target){
                return mid;
            }

            if ( isAsc ){
                if(target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }



        }
        return -1;

    }

}
