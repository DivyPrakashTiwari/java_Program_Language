import java.util.*;

// Class named t1 with the main method
public class password_Checker{
    // Main method begins execution of Java application
    public static void main(String[] args) 
    {
        // Create a new Scanner object to read input from the user
        Scanner i=new Scanner(System.in);
        
        // Prompt the user to enter their password
        System.out.print("Enter your password: ");
        
        // Read the user's password input and remove leading and trailing whitespaces
        String p=i.nextLine().trim();
        
        // Initialize a counter variable cc to 0
        int cc=0;
        
        // Loop until the counter variable cc is 1
        while(cc!=1)
        {
            // If the length of the password is less than 8
            if (p.length() < 8) 
            {
                // Print that the password is not long enough
                System.out.println("password is not long enough");
                
                // Prompt the user to enter their password again
                System.out.print("Enter your password: ");
                
                // Read the user's password input and remove leading and trailing whitespaces
                p=i.nextLine().trim();
            }
            else
            {
                // Increment the counter variable cc by 1
                cc=cc+1;
            }
        }
        
        // Get the first character of the password
        char c=p.charAt(0);
        
        // If the first character of the password is not an uppercase letter
        if (!Character.isUpperCase(c))
        {
            // Convert the first character to uppercase and concatenate it with the rest of the password
            p=Character.toUpperCase(c) + p.substring(1);
        }
        
        // Replace all occurrences of 'a' with 'A' in the password
        p=p.replace('a', 'A');
        
        // Print the final password
        System.out.println("your password: "+p);
    }
}