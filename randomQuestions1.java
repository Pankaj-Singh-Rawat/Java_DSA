package Java_DSA;

import java.util.Scanner;

public class randomQuestions1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int n = in.nextInt();

//        palindrome(n);
//        if(palindrome(n)){
//            System.out.println("It is a palindrome");
//        }else{
//            System.out.println("It is not a palindrome");
//        }

//        System.out.println(factorial(7));
        System.out.println(leapYear(in.nextInt()));

    }

//        1 : check if a number is palindrome;
    static boolean palindrome(int n){
        int x = n;
        int reverse = 0 ;
        int temp = 0 ;
        while( x > 0 ){

            temp = x % 10;
            x = x / 10 ;
            reverse = (reverse * 10 ) + temp;
        }
        if(n == reverse){
            return true;
        }else{
            return false;
        }
    }

    //ques 2: calculate a factorial of a number;
    static int factorial(int n ){
        int temp = 1 ;
        while(n > 0 ){
            temp = temp * n ;
            n-- ;
        }
        return temp;
    }

    // ques 3 : check if a year is a leap year or not
        static boolean leapYear(int n ) {
            if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
                System.out.println("leap year");
                return true;
            } else {
                System.out.println("not a leap year");
                return false;
            }
        }

}
