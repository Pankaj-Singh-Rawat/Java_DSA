package Java_DSA;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
//        Take a number as input and print the multiplication table for it.

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n= in.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + " x " + i + " = " + (n * i) );
        }

    }
}
