package Java_DSA;

public class shadowing {
    static int x = 90;  //this x will be shadowed at line 9 with another value of x
    public static void main(String[] args) {
        System.out.println(x);
        fun();

        int x = 40; //shadowing the value of x at line 4
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x+1);
    }
}
