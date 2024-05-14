import java.util.*;

class input_Exception
{
    public static void main(String [] args)
    {
        // Print "no exception" to the console
        System.out.println("no exception");

        // Create a new Scanner object to read input from the user
        Scanner r = new Scanner(System.in);

        // Prompt the user to enter a digit
        System.out.print("Enter the Digit : ");

        // Read the next integer entered by the user
        int n = r.nextInt();

        // Begin a try block to catch any exceptions that may occur
        try
        {
            // Check if the entered digit is even
            if((n%2)==0)
            {
                // Throw a new Exception with the message "Bhari mistake h sir"
                throw new Exception("Bhari mistake h sir");
            }

            // Print "rimender" followed by 0 to the console
            System.out.println("rimender" + 0);
        }
        // Begin a catch block to handle any exceptions that occur
        catch(Exception e)
        {
            // Print the message of the caught Exception to the console
            System.out.println(e);
        }
    }
}