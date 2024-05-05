import java.util.*;
public class reverse_Number {
    // The main method where the program starts executing
    public static void main(String[] args)
    {
        // Create a new Scanner object to read input from the user
        Scanner r = new Scanner(System.in);
        
        // Initialize three integer variables: n, rev, and d
        int n,rev=0,d=0;
        
        // Prompt the user to enter a digit
        System.out.print("Enter the Digit : ");
        
        // Read an integer value from the user and store it in the variable n
        n=r.nextInt();
        
        // Reverse the digit entered by the user
        while(n!=0)
        {
            // Obtain the remainder of n divided by 10, which is the last digit of n
            d=n%10;
            
            // Multiply the current reversed number by 10 and add the last digit
            rev=rev*10+d;
            
            // Divide n by 10 to remove the last digit
            n=n/10;
        }
        
        // Print the reversed digit
        System.out.println("The reverse of Digit is "+rev);
    }
}