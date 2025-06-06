// Concept of a method calling itself in the method is called recursion
public class Recursion {
    public static void main(String[] args) {

        printValue(20);

    }

    static void printValue(int x) {
        System.out.println(x);
        if (x > 0) {
            printValue(--x);
        } else {
            System.out.println("All values till 0 have been printed");
        }
    }
}
