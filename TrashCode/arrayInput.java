package TrashCode;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives ;

//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 23;
//        arr[3] = 543;
//        arr[4] = 30;
//        arr[5] = 11;

//        System.out.println(arr[1]);

        // input using for loops;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

//        instead of using this we can use the enhanced for loop;

//        for (int j : arr) {
//            System.out.println(j + " ");
//        }


        // array of objects ;
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify;
        str[1] = "Pankaj";
        System.out.println(Arrays.toString(str));

    }
}
