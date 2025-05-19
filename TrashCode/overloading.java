package TrashCode;

import java.util.Arrays;

public class overloading {
    public static void main(String[] args) {

        fun(2);
        fun("Pankaj");
        fun(69, 96);
        demo(1 , 10);
        demo("pankaj" , "singh" , "rawat");
    }

    //two functions of same can only exist if their parameters are different;

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int x , int y){
        System.out.println(x + " " + y);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void demo (int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo (String ...v){
        System.out.println(Arrays.toString(v));
    }

}
