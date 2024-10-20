package Java_DSA;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {

        fun(2,3,4,5,6,69,9);

//        fun();
        nofun("Pankaj" , "noPankaj" , "YesPankaj");


        multiple(2, 3, "Pankaj" , "YesPankaj");

    }

    static void fun(int ...v){ // ...v = array of integers
        System.out.println(Arrays.toString(v));
    }

    static void nofun (String ...x){ //...x = array of strings
        System.out.println(Arrays.toString(x));
    }

    static void multiple(int a, int b, String ...z){
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + " " + b + " " + Arrays.toString(z));
    }

}
