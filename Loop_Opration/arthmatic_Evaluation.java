import java.util.*;

public class arthmatic_Evaluation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner r = new Scanner(System.in);
        
        // Initialize variables to store the input number, digit, sum, and product
        int n, d, p = 1, s = 0;
        
        // Prompt the user to enter a digit
        System.out.print("Enter the Digit to find its SUM & Product : ");
        
        // Read the input number from the user
        n = r.nextInt();
        
        // Loop until the input number becomes 0
        while (n != 0) {
            // Calculate the last digit of the number
            d = n % 10;
            
            // Add the digit to the sum
            s = s + d;
            
            // Multiply the product by the digit
            p = p * d;
            
            // Remove the last digit from the number
            n = n / 10;
        }
        
        // Print the sum of digits
        System.out.println("Sum of Digit is " + s);
        
        // Print the product of digits
        System.out.println("Product of Digit is " + p);
    }
}
