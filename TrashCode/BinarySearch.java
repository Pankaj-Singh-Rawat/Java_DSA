package TrashCode;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // for sorted array !
        int[] arr = {1, 5, 10, 15, 20, 25, 30};
        int target = 20;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    //return the index
    static int binarySearch(int[] arr , int target){
        int start = arr[0];
        int end = arr.length - 1;
        while(start <= end){
            // find the middle element
//            int mid = (s + e)/2;
            // better way to find mid
            int mid = start + (end - start) / 2; // for data longer than the int range

            if(target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }

}
