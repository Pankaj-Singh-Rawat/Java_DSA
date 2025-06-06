// Scope: variables are only accessible inside the region they are created {HERE}. This is called scope. 
public class Scope {
    public static void main(String[] args) {

        int x = 10;

        // usable in this main block everywhere

        {
            int y = 29;
            System.out.println(y);

            // this y is defined here only and after this block ends the variable y will not
            // be usable
        }

        // here only x works and not y
        System.out.println(x);
        // System.out.println(y); this line of code wont work here
    }
}
