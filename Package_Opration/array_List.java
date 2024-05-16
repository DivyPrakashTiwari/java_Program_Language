package pack1;

// Importing necessary packages
import java.util.*;
import java.util.ArrayList;
import static java.lang.Math.*;

public class array_List {
    public static void main(String[] args) {
        // Creating an ArrayList to store names
        ArrayList<String> names = new ArrayList<>();
        
        // Adding names to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Declaring a variable to store a number
        double num = 25.0;
        
        // Calculating the square root of the number
        double squareRoot = sqrt(num);
        
        // Printing the result
        System.out.println("Square root of " + num + " is " + squareRoot);
    }
}