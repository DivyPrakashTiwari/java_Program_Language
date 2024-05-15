import java.util.*;

// Class j2 contains two overloaded calculate methods
class function_Object
{
    // Method to calculate the product of two integers
    void calculate(int a,int b)
    {
        // Print the product of the two integers
        System.out.println("product "+(a*b));  
    }

    // Method to calculate the product of two floating-point numbers
    void calculate(double a,double b)
    {
        // Print the product of the two floating-point numbers
        System.out.println("product "+(a*b));  
    }

    // Main method to create an instance of j2 and call the calculate methods
    public static void main(String [] args)
    {
        // Create an instance of j2
        function_Object obj = new function_Object();

        // Call the calculate method with integer arguments
        obj.calculate(5,3);

        // Call the calculate method with floating-point arguments
        obj.calculate(5.3,3.5);
    }
}