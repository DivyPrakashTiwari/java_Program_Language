import java.util.*;

public class armstrong_Number {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner r = new Scanner(System.in);
        
        // Declare variables to store the input number, digit, power, sum, and temporary value
        int n, d, p = 1, s = 0, t;
        
        // Prompt the user to enter a digit
        System.out.print("Enter the Digit : ");
        
        // Read the input number from the user
        n = r.nextInt();
        
        // Store the input number in a temporary variable
        t = n;
        
        // Loop until the input number becomes 0
        while (n!= 0) {
            // Extract the last digit of the number
            d = n % 10;
            
            // Calculate the cube of the digit
            p = d * d * d;
            
            // Add the cube of the digit to the sum
            s = s + p;
            
            // Remove the last digit from the number
            n = n / 10;
        }
        
        // Check if the sum is equal to the original number
        if (s == t) {
            // Print a message indicating that the number is an Armstrong number
            System.out.print("Entered Digit is armstrong");
        } else {
            // Print a message indicating that the number is not an Armstrong number
            System.out.print("Entered Digit is not armstrong : ");
        }
    }
}