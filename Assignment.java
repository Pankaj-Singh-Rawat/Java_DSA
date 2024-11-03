package Java_DSA;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

//        Take a number as input and print the multiplication table for it.
//        table();

//        Take 2 numbers as inputs and find their HCF and LCM.
//        LCMandHCF();

        input();
    }

    static void LCMandHCF() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1= in.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2= in.nextInt();

        
    }

    static void table(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n= in.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + " x " + i + " = " + (n * i) );
        }
        in.close();  // Closing the scanner to avoid resource leaks
    }

//    Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

    static void input(){

        int sum = 0;

        while(true){

            System.out.println("Enter input or press 'x' to exit: ");

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            if ( n == 'x'){
                break;
            }else{
                sum += n;
            }

            System.out.println("total: " + sum);

        }
    }

}
