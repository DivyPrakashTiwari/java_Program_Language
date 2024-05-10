import java.util.*;

public class substring_Concatination_N_Terms {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner r = new Scanner(System.in);
        
        // Declare a string variable to store the concatenated string
        String s2;
        
        // Prompt the user to enter the first string
        System.out.println("Enter the first string : ");
        
        // Read the first string from the user
        String s1 = r.nextLine();
        
        // Prompt the user to enter an integer
        System.out.println("Enter the integer: ");
        
        // Read the integer from the user
        int n = r.nextInt();
        
        // Calculate the length of the first string
        int l = s1.length();
        
        // Calculate the starting index for the substring
        int ll = l-n;
        
        // Extract the substring from the first string
        s2 = s1.substring(ll, l);
        
        // Prompt the user to display the concatenated string
        System.out.println("String after concating : ");
        
        // Concatenate the substring 'n' times
        for(int i=0; i<n; i++) {
            s2 = s2 + s2;
        }
        
        // Display the concatenated string
        System.out.println("String after concating : " + s2);
    }
}