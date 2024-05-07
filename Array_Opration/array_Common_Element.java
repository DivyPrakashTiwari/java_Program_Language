import java.util.*;

public class array_Common_Element {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner r = new Scanner(System.in);

        // Initialize variables n, rev, d, t, s, and p
        int n, rev = 0, d = 0, t, s = 0, p;

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of array : ");
        n = r.nextInt();

        // Create an array of integers with the specified size
        int arr[] = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elemnts of array : ");
        for (d = 0; d < n; d++) {
            arr[d] = r.nextInt();
        }

        // Iterate through the array to find common elements
        for (d = 0; d < n; d++) {
            // If the current element is the same as the saved index, continue to the next iteration
            if (arr[d] == s) {
                continue;
            } else {
                // Iterate through the array to find duplicates of the current element
                for (t = 0; t < n; t++) {
                    // If the current index is the same as the outer loop index, continue to the next iteration
                    if (t == d) {
                        continue;
                    }
                    // If a duplicate is found, increment the rev variable and save the current index
                    if (arr[t] == arr[d]) {
                        rev = rev + 1;
                        s = d;
                    }
                }
                // If more than one duplicate is found, print the common element and its index
                if (rev > 1) {
                    System.out.print("the common elemnet " + arr[s] + " index " + (1 + s));
                }
            }
            // Save the current element for the next iteration
            p = arr[s];
        }
    }
}