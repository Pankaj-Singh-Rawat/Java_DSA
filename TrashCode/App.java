package TrashCode;
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
        // ArrayList<Boolean> result = candies();
        // System.out.println("Result: " + result);

        // Number of Good Pairs
        // Input: nums = [1,2,3,1,1,3]
        // Output: 4
        // System.out.println(goodPairs());

        // How Many Numbers Are Smaller Than the Current Number
        // Input: nums = [8,1,2,2,3]
        // Output: [4,0,1,1,3]
        // smallerThanCurrentnum();

        // Check if the Sentence Is Pangram
        // Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
        // Output: true
        // System.out.println(pangram());

        // Create Target Array in the Given Order
        // Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        // Output: [0,4,1,3,2]
        // targetArray();

        // Find the Highest Altitude
        // Input: gain = [-5,1,5,0,-7]
        // largestAltitude();

        // Flipping an Image
        

    }

    static void largestAltitude(){
        int[] gain = {-5,1,5,0,-7};
        int sum = 0 ;

        int max = 0 ;

        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i] ;
            arr1.add(sum);
        }

        Object[] arr = arr1.toArray();
        for (int j = 0; j < arr.length; j++) {
             if ( (Integer) arr[j] > max){
                max = (Integer) arr[j];
             }  
        }
        System.out.println(max);
    }



    static void targetArray(){
        int[] nums = { 0,1,2,3,4 };
        int[] index = {0,1,2,2,1};

        ArrayList<Integer> arr1 = new ArrayList<> ();     
          for (int i = 0; i < index.length; i++) {
            arr1.add(index[i] , nums[i]);
            System.out.println(arr1);
        }
        // System.out.println(arr1);
    }
    
    
    static boolean pangram(){
        
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // String sentence = "leetcode";
        boolean[] alphabet = new boolean[26];
        for (char ch : sentence.toCharArray()) {
            alphabet[ch - 'a'] = true;
            // System.out.println(ch);
        }
        
        for (boolean letterPresent : alphabet){
            if(!letterPresent){
                return false;
            }
        }
        
        return true; 
    }
    
    static void smallerThanCurrentnum(){
        
        int[] nums = {8,1,2,2,3};
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i ++ ){
            int count = 0 ;
            for(int j = 0 ; j < nums.length ;j ++ ){
                if(nums[i] > nums[j]){
                    count+= 1;
                }
            }
            arr.add(count);
        }
        System.out.println(arr);
        
    }
    
    static int goodPairs(){
        
        int[] nums = {1,2,3,1,1,3};
        int count = 0;
        for( int i = 0 ; i < nums.length ; i++){
            for( int j = i + 1 ; j < nums.length ; j++){
                if ( nums[i] == nums[j] ){
                    count += 1;
                }
            }
        }
        return count;
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
