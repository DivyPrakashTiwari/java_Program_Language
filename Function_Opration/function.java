import java.util.*;

class function {
    // Method to print an integer value
    static void fun1(int a) {
        // Print the integer value
        System.out.println("the number is " + a);
    }

    // Method to print a double value
    static void fun1(double b) {
        // Print the double value
        System.out.println("the number is " + b);
    }
    

    public static void main(String[] args) {
        // Call the fun1 method with an integer argument
        function.fun1(10);
        
        // Create an instance of the function class
        function obj = new function();
        
        // Call the fun1 method with a double argument using the object
        obj.fun1(10.10);
    }
}