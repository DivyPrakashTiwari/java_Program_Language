import java.util.*;
public class array_Negative_Numbers {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner r = new Scanner(System.in);

        // Initialize variables n, rev, d, and t
        int n, rev=0, d=0, t;

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of array : ");

        // Read the size of the array from the user
        n = r.nextInt();

        // Initialize an array of integers with the specified size
        int arr[] = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elemnts of array : ");

        // Read the elements of the array from the user and store them in the array
        for (d=0; d<n; d++) {
            arr[d] = r.nextInt();

            // Check if the current element is negative
            if(arr[d] < 0) {
                // If it is, increment the number of negative elements
                rev = rev + 1;
            }
        }

        // Check if there are any negative elements in the array
        if(rev > 0) {
            // If there are, print the number of negative elements
            System.out.print("Number of negative elements in the array: " + rev);
        } else {
            // If there aren't, print "NULL"
            System.out.print("Number of negative elements in the array: NULL");
        }
    }
}