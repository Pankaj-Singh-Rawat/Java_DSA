// Abstraction : used to achieve security and to show only Important details necessary of an object
abstract class PC{
    public abstract void myPc();
    public void anyonesPc(){
        System.out.println("Available to anyone.");
    }
}

class LocalPC extends PC{
    public void myPc(){
        System.out.println("I'm a PC made for a single user.");
    }
}
public class Abstraction {
    public static void main(String[] args) {

        LocalPC mylocal = new LocalPC();
        mylocal.myPc();
        mylocal.anyonesPc();
        
    }
}
