// Import the necessary library
import java.util.*;

// Define the class 'j' with an integer variable 'x' and 'y'
class j {
    int x = 5;
    int y = 3;

    // Define a method 'calculate' to print the sum of 'x' and 'y'
    void calculate() {
        System.out.println("Sum" + (x + y));
    }
}

// Define the class 'j1' that extends 'j'
class child_Class extends j {

    // Override the 'calculate' method to print the difference of 'x' and 'y'
    void calculate() {
        System.out.println("sub " + (x - y));
    }

    // Define the main method to create an object of 'j1' and call the 'calculate' method
    public static void main(String[] args) {
        j1 obj = new j1();
        obj.calculate();
    }
}