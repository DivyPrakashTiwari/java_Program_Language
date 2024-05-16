import java.util.*;

// Abstract class j, which declares an abstract method calculate()
abstract class j
{
    // Abstract method calculate(), which must be implemented by any subclass of j
    public abstract void calculate();
}

// Class j4, which extends the abstract class j and implements the calculate() method
class abstract_Class extends j
{
    // Implementation of the calculate() method, which calculates the modulus of two integers
    public void calculate()
    {
        // Declare and initialize two integer variables, a and b
        int a = 5;
        int b = 3;
        
        // Print the modulus of a and b using the modulus operator (%)
        System.out.println("Mod=" + (a % b)); 
    }
    
    // Main method, which is the entry point of the program
    public static void main(String[] args)
    {
        // Create an instance of j4 and assign it to a variable of type j
        j obj = new abstract_Class();
        
        // Call the calculate() method on the obj instance
        obj.calculate();
    }
}