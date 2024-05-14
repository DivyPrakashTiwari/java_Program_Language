import java.util.*;

class finally_Block
{
    public static void main(String [] args)
    {
        // Print a message to indicate that no exception has occurred
        System.out.println("no exception");
        
        try
        {
            // Perform a division operation that will not throw an exception
            int k = 10/2;
        }
        catch(Exception e)
        {
            // Catch any exceptions that may occur during the division operation
            // and print the exception message
            System.out.println(e);
        }
        finally
        {
            // This block will always be executed, regardless of whether an exception occurred
            // Print a message to indicate that the program will continue to run
            System.out.println("Apun tho chalega");
        }
    }
}