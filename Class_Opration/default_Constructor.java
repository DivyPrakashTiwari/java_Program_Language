// Import necessary libraries
import java.util.*;

// Define a class dc with a default constructor
class dc
{
    // Default constructor
    public dc()
    {
        System.out.println("default constructor");
    }
}

// Define a subclass sdc of dc with a default constructor
class sdc extends dc
{
    // Default constructor
    public sdc()
    {
        System.out.println("sub default constructor");
    }
}

// Main class with the main method
class default_Constructor
{
    // Main method
    public static void main (String[] args)
    {
        // Create an instance of the sdc class
        sdc obj=new sdc();
    }
}