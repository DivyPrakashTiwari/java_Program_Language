package pack0;

import java.util.Scanner; // Importing the Scanner class to take user input

public class package_Object
{
    // Main method where the program starts execution
    public static void main(String[] args) {
        // Declaring and initializing variables
        int x = 0, y = 0, sub = 0;

        // Creating a Scanner object to read input from the user
        Scanner myObj = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.println("Enter a first no:");

        // Reading the first number entered by the user
        x = myObj.nextInt();

        // Prompting the user to enter the second number
        System.out.println("Enter a second no:");

        // Reading the second number entered by the user
        y = myObj.nextInt();

        // Performing subtraction of the second number from the first number
        sub = x - y;

        // Displaying the result of the subtraction
        System.out.println("Sub is: " + sub);
    }
}