import java.util.*;

public class palindrom_Number {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner r = new Scanner(System.in);
        
        // Declare variables to store the input number, its reverse, and a temporary value
        int n, rev = 0, d = 0, t;
        
        // Prompt the user to enter a digit
        System.out.print("Enter the Digit to check palindrom : ");
        
        // Read the input number
        n = r.nextInt();
        
        // Store the original value of n in t
        t = n;
        
        // Loop until n becomes 0
        while (n!= 0) {
            // Calculate the last digit of n
            d = n % 10;
            
            // Append the last digit to the reverse number
            rev = rev * 10 + d;
            
            // Remove the last digit from n
            n = n / 10;
        }
        
        // Check if the reverse number is equal to the original number
        if (rev == t) {
            // If they are equal, print that the digit is a palindrome
            System.out.println("The digit is palindrom ");
        } else {
            // If they are not equal, print that the digit is not a palindrome
            System.out.println("The digit is not palindrom ");
        }
    }
}
