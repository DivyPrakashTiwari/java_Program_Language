import java.util.*;

// Class j3 with an instance variable x initialized to 5
class function_Class {
    int x = 5;

    // Method to calculate and print the square of x
    void calculate() {
        // Print the string "Square" followed by the square of x
        System.out.println("Square" + (x * x));
    }

    // Main method to create an object of j3 and call the calculate method
    public static void main(String[] args) {
        function_Class obj = new function_Class();
        obj.calculate();
    }
}