import java.util.*;
class odd_Even_Numbers {
    public static void main(String[] p)
    {
        // Create a Scanner object to read input from the user
        Scanner r = new Scanner(System.in);
        
        // Declare and initialize variables for the dividend, divisor, quotient, and remainder
        int n1, n2, quo, rem;
        
        // Prompt the user to enter the dividend
        System.out.print("Enter the Dividend : ");
        
        // Read the dividend from the user
        n1 = r.nextInt();
        
        // Prompt the user to enter the divisor
        System.out.print("Enter the Divisor : ");
        
        // Read the divisor from the user
        n2 = r.nextInt();
        
        // Calculate the quotient and remainder of the division
        quo = n1 / n2;
        rem = n1 % n2;
        
        // Print the quotient and remainder
        System.out.println("Quotient :  " + quo);
        System.out.println("Remainder :  " + rem);
        
        // Check if the dividend is odd or even
        if (n1 % 2!= 0) {
            System.out.println("odd");
        }
        // Check if the dividend is divisible by 2 and 3
        else if (n1 % 2 == 0 && n1 % 3 == 0) {
            System.out.println("super");
        }
        // Check if the dividend is divisible by 2
        else if (n1 % 2 == 0) {
            System.out.println("even");
        }
    }
}