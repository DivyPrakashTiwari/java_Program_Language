import java.util.*;

public class j1 {
    // Main method
    public static void main(String[] args) {
        // Create a new Scanner object to read input
        Scanner r = new Scanner(System.in);
        
        // Initialize variables
        int c, n1, n2;
        double d;
        
        // Print welcome message
        System.out.println("WELCOME TO MENU DRIVEN");
        
        // Print menu options
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Square root");
        
        // Prompt user to enter choice
        System.out.print("Enter your choice : ");
        
        // Read user input for choice
        c = r.nextInt();
        
        // Use switch statement to perform operation based on user choice
        switch(c) {
            case 1:
                // Prompt user to enter two numbers for addition
                System.out.print("Enter the Digits to be summed : ");
                
                // Read user input for two numbers
                n1 = r.nextInt();
                n2 = r.nextInt();
                
                // Print sum of two numbers
                System.out.print("Sum of the Digits are : " + (n1 + n2));
                
                // Break statement to exit switch statement
                break;
            
            case 2:
                // Prompt user to enter two numbers for subtraction
                System.out.print("Enter the Digits to be subtracted : ");
                
                // Read user input for two numbers
                n1 = r.nextInt();
                n2 = r.nextInt();
                
                // Print difference of two numbers
                System.out.print("value of the Digits are : " + (n1 - n2));
                
                // Break statement to exit switch statement
                break;
            
            case 3:
                // Prompt user to enter two numbers for multiplication
                System.out.print("Enter the Digits to be multiplited : ");
                
                // Read user input for two numbers
                n1 = r.nextInt();
                n2 = r.nextInt();
                
                // Print product of two numbers
                System.out.print("product of the Digits are : " + (n1 * n2));
                
                // Break statement to exit switch statement
                break;
            
            case 4:
                // Prompt user to enter two numbers for division
                System.out.print("Enter the Digits to be divided : ");
                
                // Read user input for two numbers
                n1 = r.nextInt();
                n2 = r.nextInt();
                
                // Print quotient of two numbers
                System.out.print("value of the Digits are : " + (n1 / n2));
                
                // Break statement to exit switch statement
                break;
            
            case 5:
                // Prompt user to enter a number and its power
                System.out.print("Enter the Digit and the power : ");
                
                // Read user input for number and its power
                n1 = r.nextInt();
                n2 = r.nextInt();
                
                // Print power of number
                System.out.print("power value of the Digits is : " + Math.pow(n1, n2));
                
                // Break statement to exit switch statement
                break;
            
            case 6:
                // Prompt user to enter a number for square root
                System.out.print("Enter the Digit : ");
                
                // Read user input for number
                n1 = r.nextInt();
                
                // Calculate square root of number
                d = n1 * 0.5;
                
                // Print square root of number
                System.out.print("Square root of the Digit is : " + d);
                
                // Break statement to exit switch statement
                break;
            
            default:
                // Print error message for invalid choice
                System.out.println("entered option is wrong");
        }
    }
}