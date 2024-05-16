package pack2;
import static java.lang.Math.*; // Importing static members of Math class for convenience

public class package_Function {
    public static void main(String[] args) {
        double num = 4.0; // Initialize a double variable with value 4.0
        
        // Calculate the square root of the number
        double squareRoot = sqrt(num);
        
        // Calculate the power of the number (raised to 2)
        double power = pow(num, 2);
        
        // Calculate the absolute value of the number
        double absoluteValue = abs(num);
        
        // Print the results
        System.out.println("Square root of " + num + " is " + squareRoot);
        System.out.println(num + " raised to the power of 2 is " + power);
        System.out.println("Absolute value of " + num + " is " + absoluteValue);
    }
}