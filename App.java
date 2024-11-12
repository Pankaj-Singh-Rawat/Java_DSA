import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // 2D array syntax !

        // int[][] arr = new int[3][2]; // must add one parameter either row or column
        // arr = new int[][]{
        // {1, 2 },
        // {4, 5},
        // {7, 8}
        // };

        // Shuffle the Array
        // Input: nums = [2,5,1,3,4,7], n = 3
        // Output: [2,3,5,4,1,7]
        // shufflearr();

        // Kids With the Greatest Number of Candies
        // Input: candies = [2,3,5,1,3], extraCandies = 3
        // Output: [true,true,true,false,true]
        ArrayList<Boolean> result = candies();
        System.out.println("Result: " + result);
    }

    static ArrayList<Boolean> candies() {

        int[] candie = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        int max = 0;
        for (int i = 0; i < candie.length; i++) {
            if (candie[i] > max) {
                max = candie[i];
            }
        }

        ArrayList<Boolean> result = new ArrayList<>();
        int test;

        for (int j = 0; j < candie.length; j++) {
            if (candie[j] + extraCandies >= max) {
                result.add(true);
            }else{
                result.add(false);
            }
            }
            return result;
        }



    static void shufflearr() {
        Scanner in = new Scanner(System.in);
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        ArrayList<Integer> arr1 = new ArrayList<>();

        int x = 3;
        for (int i = 0; i < 3; i++) {
            arr1.add(nums[i]);
            for (int j = x; j < nums.length; j++) {
                arr1.add(nums[j]);
                break;
            }
            x = x + 1;
        }

        System.out.println(arr1);

        // for (int i = 3; i < nums.length; i++) {
        // arr1.add(nums[i]);
        // }
        // System.out.println(arr1);
    }
}
