// Method overriding : redefining a method of the parent (superclass) in the child (subclass) with the same name, return type, and parameters.
// Also known as run time polymorphism
class Parent{
    void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    @Override

    void show(){
        
        System.out.println("child");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Child(); //Parent reference, Child object → Runtime Polymorphism
        p.show();
    }
}
