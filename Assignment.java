package Java_DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

//        Take a number as input and print the multiplication table for it.
//        table();

//        Take 2 numbers as inputs and find their HCF and LCM.
//        lcm();

//        input();
        
//        To find out whether the given String is Palindrome or not.
//        stringPalindrome();

//        To find Armstrong Number between two given number.
//        armstrong();

//        Perfect Number In Java
        perfectNum();

    }

    static void perfectNum() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0 ;
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
               sum = sum + i;
            }
        }
        if(n == sum){
            System.out.println("Perfect Number.");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }

    static void armstrong() {
        Scanner in = new Scanner(System.in);

        System.out.println("Starting Range: ");
        int n1 = in.nextInt();
        System.out.println("Ending Range: ");
        int n2 = in.nextInt();

        for (int i = n1; i < n2 ; i++) {
            int temp = 0;
            int n = i ;
            while( n > 0){
                temp += (n % 10) * ( n % 10) * ( n % 10) ;
                 n =  n / 10 ;
            }
            if (i == temp){
                System.out.println(temp + " is a Armstrong number");
            }
        }
    }

    static void stringPalindrome() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a name to check if pallindrome: ");
        String name = in.nextLine();

        String reverse = "";
        for (int i = name.length() - 1 ; i >= 0 ; i--) {
            reverse += name.charAt(i);
        }
        if(reverse.equals(name)){
            System.out.println(name + " is palindrome");;
        }else{
            System.out.println(name + " is not palindrome");
        }
    }

    static void lcm() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1= in.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2= in.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n1; i++) {
            if( n1 % i == 0 ){
                numbers.add(i);
            }
        }

        ArrayList<Integer> numbersB = new ArrayList<>();

        for (int j = 1; j <= n2; j++) {
            if( n2 % j == 0 ){
                numbersB.add(j);
            }
        }

        ArrayList<Integer> numbern1 = new ArrayList<>();
        while(true){

            int lcm = 1;

            for (int index = 0; index < numbers.size() ; index++) {

                int temp = numbers.get(index);

                if(lcm == n1){
                    break;
                }else {
                    numbern1.add(temp);
                    lcm *= temp;
                }

            }
            break;
        }

        ArrayList<Integer> numbern2 = new ArrayList<>();
        while(true){

            int lcm = 1;

            for (int index = 0; index < numbersB.size() ; index++) {

                int temp = numbersB.get(index);

                if(lcm == n2){
                    break;
                }else {
                    numbern2.add(temp);
                    lcm *= temp;
                }

            }
            System.out.println(numbern2);
            break;
        }

//        numbern1.addAll(numbern2);
//
//        System.out.println(numbern1);

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
