// Instance Variables:
        // Instance variables are known as non-static variables and are declared in a class outside of any method, constructor, or block.

        // Instance variables are created when an object of the class is created and destroyed when the object is destroyed.
        // Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
        // Initialization of an instance variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
        // Scope of instance variables are throughout the class except the static contexts.
        // Instance variables can be accessed only by creating objects.
        // We initialize instance variables using constructors while creating an object. We can also use instance blocks to initialize the instance variables.
    

import java.io.*;

class InstanceVariables {

    // Declared Instance Variable
    public String var;
    public int i;
    public Integer I;
    public InstanceVariables()
    {
        // Default Constructor
        // initializing Instance Variable
        this.var = "Pankaj";
    }

    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
        InstanceVariables name = new InstanceVariables();

        // Displaying O/P
        System.out.println("Var name is: " + name.var);
        System.out.println("Default value for int is "+ name.i);
      
        // toString() called internally
        System.out.println("Default value for Integer is: "+ name.I);
    }
}