import java.util.*;

// Class name indicates the purpose of the program is to demonstrate exception handling
class exception_Handling_Basic
{
    public static void main(String [] args)
    {
        // Print a message indicating that no exception has occurred yet
        System.out.println("no exception");

        // Begin a try block to catch any exceptions that may occur
        try
        {
            // Attempt to perform integer division by zero, which will throw an exception
            int k = 10 / 0;
        }
        // Catch any exceptions that occur within the try block
        catch(Exception e)
        {
            // Print the details of the exception that occurred
            System.out.println(e);
        }
    }
}