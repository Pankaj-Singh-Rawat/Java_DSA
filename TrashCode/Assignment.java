package TrashCode;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

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
//        perfectNum();

//        Sum Of A Digits Of Number
//        sumOfDig();

//        Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
//        longProgram();

//        Define a method to find out if a number is prime or not.
//        primeNo();

//        Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//
//
//        Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//                <=40          Fail
//        marks();

//        Build Array from Permutation
//        buildArray();

//        Given an integer array nums of length n, you want to create an array ans of length 2n
//        (Concatenation of Array)
//        concatenation();

//        Running Sum of 1d Array
//        runningSum();

//        Subtract the Product and Sum of Digits of an Integer
        // subtractProductAndSum();

        // addition of two numbers using a method
        System.out.println(addTwoNum(45 , 55));

            }


    static int addTwoNum(int a , int b){
        return a + b ; 
    }

    static void subtractProductAndSum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        int product = 1;
        int sum = 0 ;
        while(n>0){
            int temp = n % 10 ;
            product *= temp;
            sum += temp;
            n = n / 10;
        }
        System.out.println( "ans is : " + (product - sum) );
    }

    static void runningSum() {
        int[] num = {1,2,3,4};

         ArrayList<Integer> ans = new ArrayList<>();
         int temp = 0 ;
        for (int i = 0; i < num.length; i++) {

            temp += num[i];
            ans.add(temp);
        }

        System.out.println(ans);
    }

    static void concatenation() {

        int[] in = {1,3,2,1};
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 2;
        while(count > 0){
            for (int i = 0; i < in.length; i++) {
                ans.add(in[i]);
            }
            count -- ;
        }

        System.out.println(ans);

    }

    static void buildArray() {

//        Input: nums = [0,2,1,5,3,4]
//        int[] nums = {0,2,1,5,3,4};
        int[] nums = {5,0,1,2,3,4};

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length ; i++) {

            int temp =  nums[nums[i]];
            ans.add(temp);
        }
        System.out.println(ans);

    }


    static void marks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you Marks: ");
        int marks = in.nextInt();

        if (marks > 90) {
            System.out.println("AA");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("AB");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("BB");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("BC");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("CD");
        } else if (marks > 40 && marks <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }

    }

    static void primeNo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = in.nextInt();


        for (int i = 2; i < n ; i++) {

            if( n % i == 0){
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");
    }

    static void longProgram() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range from -ve to +ve : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int negSum = 0 ;
        while(n1 < 0 ){
            negSum += n1;
            n1++;
        }
        System.out.println("Sum of negative numbers = " + negSum);

        int posEvSum = 0;
        int posOdSum = 0;

        for (int i = n1; i < n2; i++) {

            if( i > 0 && i%2 == 0){
                posEvSum += i;
            }else if( i > 0 && i%2 == 1){
                posOdSum += i;
            }
        }
        System.out.println("Sum of positive even numbers = " + posEvSum);
        System.out.println("Sum of positive odd numbers = " + posOdSum);

    }

    static void sumOfDig() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int sum = 0;
        while ( n > 0){
            int temp = n % 10 ;
            sum += temp;
            n = n / 10;
        }
        System.out.println(sum);
    }

    static void perfectNum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
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
