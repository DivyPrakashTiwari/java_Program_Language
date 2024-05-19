import java.util.Scanner; // Importing the Scanner class to take input from the user

public class weird_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creating a new Scanner object
        System.out.println("Enter the digit between 1 to 100"); // Prompting the user to enter a number between 1 and 100
        int n = s.nextInt();
        
        // Checking if the entered number is within the valid range
        if (n > 1 && n > 100) {
            System.out.println("Wrong range. Enter the digit between 1 to 100"); // Prompting the user to enter a valid number
            int nn = s.nextInt();
            n = nn;
        }
        
        // Checking if the number is odd or even and printing the result
        if (n % 2 == 1) {
            System.out.println("Weird"); // Printing "Weird" if the number is odd
        } else {
            // Checking if the number is within the range of 2 to 5 or 6 to 20 and printing the result
            if (n >= 2 && n <= 5) {
                System.out.println("Not wired"); // Printing "Not wired" if the number is even and between 2 and 5
            } else if (n >= 6 && n <= 20) {
                System.out.println("Wired"); // Printing "Wired" if the number is even and between 6 and 20
            } else {
                System.out.println("Not wired"); // Printing "Not wired" if the number is even and not within the range of 2 to 20
            }
        }
    }
}