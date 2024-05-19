import java.util.*;
public class loops_Table 
{
    public static void main(String args[])
    {
        // Create a new Scanner object to read user input
        Scanner k = new Scanner(System.in);
        
        // Declare two integer variables to store the start and end of the table
        int kt, et;
        
        // Prompt the user to enter the table they want to generate
        System.out.println("enter the table");
        
        // Read the user's input and store it in kt
        kt = k.nextInt();
        
        // Prompt the user to enter the end of the table
        System.out.println("enter the table end");
        
        // Read the user's input and store it in et
        et = k.nextInt();
        
        // Use a for loop to generate the table from 1 to et
        for(int t = 1; t <= et; t++)
        {
            // Print the multiplication result of kt and t
            System.out.println(kt + " * " + t + " = " + kt * t);
        }
        
        // Initialize a variable t to 1, which will be used in the while loop
        int t = 1;
        
        // Use a while loop to generate the table, but this loop will not execute because t is already 1 and the condition is t <= 0
        while(t <= 0)
        {
            // Print the multiplication result of kt and t, but this will not be executed
            System.out.println("while" + kt + " * " + t + " = " + kt * t);
            t++;
        }
        
        // Initialize t to 1 again, which will be used in the do-while loop
        t = 1;
        
        // Use a do-while loop to generate the table, but this loop will not execute because t is already 1 and the condition is t <= 0
        do
        {
            // Print the multiplication result of kt and t, but this will not be executed
            System.out.println(kt + " * " + t + " = " + kt * t);
            t++;
        }while(t <= 0);
    }
}