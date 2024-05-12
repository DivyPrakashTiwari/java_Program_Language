// Import necessary libraries
import java.util.*;

// Define a class dc with a constructor that takes an integer parameter
class dc {
    // Constructor for class dc
    public dc(int b) {
        // Print a message to the console when the constructor is invoked
        System.out.println("default constructor" + b);
    }
}

// Define a subclass sdc that extends class dc
class sdc extends dc {
    // Constructor for class sdc that takes an integer parameter
    public sdc(int b) {
        // Call the constructor of the superclass with a value of 77
        super(77);
        // Print a message to the console when the constructor is invoked
        System.out.println("sub default constructor" + b);
    }
}

// Define the main class j5 with the main method
class subclass_Constructor {
    // The main method, which is the entry point of the program
    public static void main (String[] args) {
        // Create an instance of class sdc with a value of 7
        sdc obj = new sdc(7);
    }
}