class OuterClass{
    int x = 5;

    class InnerClass{
        int y = 10;

        class ultimateInnerClass{
            int z = 50;
        }
    }

    static class StaticInnerClass{
        int a = 1;
    }
    
}

public class InnerClasses {

    public static void main(String[] args) {
        
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        OuterClass.InnerClass.ultimateInnerClass myUltimate = myInner.new ultimateInnerClass();

        OuterClass.StaticInnerClass myStatic = new OuterClass.StaticInnerClass();
        System.out.println(myStatic.a);
    }
    
}
