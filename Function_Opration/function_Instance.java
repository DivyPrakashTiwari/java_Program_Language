import java.util.*;

// Class funtion_Instance with a single static method fun1
class function_Instance{
    // fun1 method returns an integer value of 10
    static int fun1()
    {
        // Initialize integer variable 'a' with value 10
        int a=10;
        // Return the value of 'a'
        return a;
    }
    

    // Main method to test fun1 method
    public static void main (String[] args)
    {
        // Call fun1 method and assign the returned value to integer variable 'a'
        int a=function_Instance.fun1();
        // Print the value of 'a'
        System.out.print(a);

        // Create an instance of funtion_Instance class
        function_Instance obj = new function_Instance();
        // Call fun1 method on the created instance
        obj.fun1();

        // Print the value of 'a' again
        System.out.print(a);
    }
}