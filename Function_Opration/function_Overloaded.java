import java.util.*;

class function_Overloaded {
    /**
     * Overloaded method to return an integer value.
     * This method takes an integer as an argument and returns the same value.
     * 
     * @param a the integer value to be returned
     * @return the input integer value
     */
    static int j5(int a) {
        return a;
    }

    /**
     * Overloaded method to return a double value.
     * This method takes a double as an argument, but ignores it and returns a hardcoded value.
     * 
     * @param a the double value (not used in the method)
     * @return 10.10
     */
    static double j5(double a) {
        return 10.10;
    }

    /**
     * The main entry point of the program.
     * 
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        /**
         * Calling the integer j5 method with an argument.
         */
        int a = function_Overloaded.j5(5);  
        System.out.print(a);

        /**
         * Creating an instance of the j5 class.
         */
        function_Overloaded obj = new function_Overloaded();

        /**
         * Calling a method j5(double) on the obj instance.
         */
        double b = obj.j5(10.0);  
        System.out.print(b);
    }
}