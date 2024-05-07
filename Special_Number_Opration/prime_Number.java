import java.util.Scanner; // Importing the Scanner class to take input from the user

public class prime_Number {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in); // Creating a new Scanner object to read input
        int i, c = 0, n; // Declaring variables
        System.out.print("Enter the Digit : "); // Prompting the user to enter a digit
        n = r.nextInt(); // Reading the integer input from the user

        // Looping through numbers from 2 to n-1
        for (i = 2; i <= n; i++) {
            // If the current number is n, we skip it since a number cannot divide itself
            if (i == n) {
                continue;
            }
            // If n is divisible by the current number, it is not a prime number
            if (n % i == 0) {
                c = c + 1;
            }
        }

        // If c is greater than 0, it means that n is not a prime number
        if (c > 0) {
            System.out.println("the digit is not prime");
        }
        // If c is 0, it means that n is a prime number
        else {
            System.out.println("the digit is prime");
        }
    }
}