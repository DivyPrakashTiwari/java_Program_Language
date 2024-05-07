import java.util.*;
public class array_Second_Largest_Number {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner r = new Scanner(System.in);

        // Initialize variables n, rev, d, t, and s
        int n, rev=0, d=0, t, s;

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of array : ");

        // Read the size of the array from the user
        n = r.nextInt();

        // Create an array of integers with the specified size
        int arr[] = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of array : ");

        // Read the elements of the array from the user and find the largest element
        for (d=0; d<n; d++)
        {
            arr[d] = r.nextInt();
            if(arr[d] > rev)
            {
                rev = arr[d];
            }
        }

        // Initialize the variable s with the first element of the array
        s = arr[0];

        // Find the second largest element in the array
        for (d=0; d<n; d++)
        {
            if(arr[d] < rev && arr[d] > s)
            {
                s = arr[d];
            }
        }

        // Print the second largest element of the array
        System.out.print("The second largest element of the array is : " + s);
    }
}