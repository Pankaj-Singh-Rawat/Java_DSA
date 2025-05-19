package TrashCode;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        ques - store a roll numer
        int rollnum = 55;

//        ques - store a person's name
        String personName = "Pankaj";

//        store 5 roll numbers;
        // concept of array arrives ;
        // datatype[] variable_name = new datatypr[size];
//        int[] rollnumbers = new int[5];
//
//        // or directly ;
//        int[] rollnumbers2 = {23,34,45,55,69};

        int[] rollNumbers; // declaration of variable for array ;
        rollNumbers = new int[5]; // creating the object in heap memory of size [5];
        // this is called dynamic memory allocation;

        System.out.println(rollNumbers[2]);

        //string array ;
        String[] arr = new String[4]; // array of size 4;
        System.out.println(arr[3]); // print the value of arr at index 3;

        String num = null;



    }
}
