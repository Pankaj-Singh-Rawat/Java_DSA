// Static Variables
// Static variables are also known as class variables. 

// These variables are declared similarly to instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.
// Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
// Static variables are created at the start of program execution and destroyed automatically when execution ends.
// Initialization of a static variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
// If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won't halt the program. The compiler will replace the object name with the class name automatically.
// If we access a static variable without the class name, the compiler will automatically append the class name. But for accessing the static variable of a different class, we must mention the class name as 2 different classes might have a static variable with the same name.
// Static variables cannot be declared locally inside an instance method.
// Static blocks can be used to initialize static variables.


import java.io.*;

class StaticVariables {
    
    // Declared static variable
    public static String var = "Pankaj";
  
    public static void main(String[] args)
    {

        // var variable can be accessed without object
        // creation Displaying O/P StaticVariables.var --> using the
        // static variable
        System.out.println("Var Name is: " + StaticVariables.var);

        // static int c = 0;
        // above line, when uncommented,
        // will throw an error as static variables cannot be
        // declared locally.
    }
}