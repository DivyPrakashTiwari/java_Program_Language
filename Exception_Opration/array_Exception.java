import java.util.*;

class array_Exception {
    public static void main(String[] args) {
        // Print a message to indicate no exception has occurred
        System.out.println("no exception");

        // Initialize an integer array with three elements
        int arr[] = {1, 2, 3};

        // Attempt to access the fourth element of the array, which will throw an ArrayIndexOutOfBoundsException
        try {
            System.out.println("exception" + arr[3]);
        }
        // Catch the exception and print an error message
        catch (Exception e) {
            System.out.println("Bhari mistake hogaya sir");
        }
    }
}