import java.util.*;

public class factorial {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner r = new Scanner(System.in);
        
        // Declare variables to store the number entered by the user and its factorial
        int n, i, f = 1;
        
        // Prompt the user to enter a number to calculate its factorial
        System.out.print("Enter the Number whos factorial value to be calculated : ");
        
        // Read the number entered by the user
        n = r.nextInt();
        
        // Calculate the factorial of the number using a for loop
        for (i = 1; i <= n; i++) {
            // Multiply the factorial by the current number
            f = f * i;
        }
        
        // Print the result to the console
        System.out.println("Factorial of " + n + " is " + f);
    }
}