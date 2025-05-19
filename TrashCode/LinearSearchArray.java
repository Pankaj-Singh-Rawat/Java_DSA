package TrashCode;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {19, 22, 13, 43, 5};

//        find n in array
        System.out.println("what number to search in array? : ");
        int n = in.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            if( n == arr[i] ){
                System.out.println(n + " found at index " + i );
                break;

            }
        }

    }
}
