package TrashCode;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int[][] arr = new int[3][3];

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

//        System.out.println(Arrays.toString(arr[1]));



//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index
//        };

        int[][] arr = new int[3][2];
        System.out.println(arr.length); // prints number of rows

        //input
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row ;
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

//        System.out.println(Arrays.deepToString(arr));

    }
}
