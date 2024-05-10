import java.util.*;

// Class j1 contains the main method for a simple Java program
// that concatenates two user-input strings and prints the result.
public class string_Concatination {

    // The main method is the entry point for the Java application.
    public static void main(String[] args) {

        // Instantiate a new Scanner object to read input from the console.
        Scanner r = new Scanner(System.in);

        // Prompt the user to enter the first string.
        System.out.println("Enter the first string : ");

        // Read the first string from the console and store it in variable s1.
        String s1 = r.nextLine();

        // Prompt the user to enter the second string.
        System.out.println("Enter the second string : ");

        // Read the second string from the console and store it in variable s2.
        String s2 = r.nextLine();

        // Convert both strings to lowercase using the toLowerCase() method.
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Print a message to the console indicating the concatenated string.
        System.out.println("String after concatenating : ");

        // Concatenate the two strings and print the result to the console.
        System.out.println(s1 + s2);
    }
}