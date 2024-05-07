import java.util.Scanner;

public class leap_Year {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.println("Enter the year");

        // Read the input from the user and store it in the variable 'year'
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            // If the conditions are met, print "The given year is a Leap Year"
            System.out.println("The given year is a Leap Year");
        } else {
            // If the conditions are not met, print "The given year is not a Leap Year"
            System.out.println("The given year is not a Leap Year");
        }

        // Close the scanner
        scanner.close();
    }
}