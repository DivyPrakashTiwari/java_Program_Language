import java.util.*;

public class array_Element_Replace {

    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner r = new Scanner(System.in);

        // Initialize variables for the array size, reversed number, digit, temporary variable, and sum
        int n, rev=0, d=0, t, s;

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of array : ");
        n = r.nextInt();

        // Create an array of integers with the specified size
        int arr[] = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of array : ");
        for (d=0; d<n; d++) {
            arr[d] = r.nextInt();
        }

        // Prompt the user to enter the element's location index
        System.out.print("Enter the element's location index : ");
        t = r.nextInt();

        // Prompt the user to enter the element to be replaced
        System.out.print("Enter the element : ");
        rev = r.nextInt();

        // Replace the element at the specified index with the new element
        arr[t-1] = rev;

        // Print the elements of the array
        for (d=0; d<n; d++) {
            System.out.print(arr[d] + " ");
        }
    }
}