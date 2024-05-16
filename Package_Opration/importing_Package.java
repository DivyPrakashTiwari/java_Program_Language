import pack.j1; // Importing package j1
import pack0.j2; // Importing package j2
import java.util.Scanner; // Importing the Scanner class to take user input

class importing_Package {
  public static void main(String[] args) {
    // Declaring and initializing variables
    int x = 0, y = 0, sum = 0, sub = 0;

    // Creating a Scanner object
    Scanner myObj = new Scanner(System.in);

    // Prompting user to enter the first number
    System.out.println("Enter a first no:");

    // Reading the first integer entered by the user
    x = myObj.nextInt();

    // Prompting user to enter the second number
    System.out.println("Enter a second no:");

    // Reading the second integer entered by the user
    y = myObj.nextInt();

    // Calculating the sum of x and y
    sum = x + y;

    // Displaying the sum
    System.out.println("Sum is: " + sum);

    // Calculating the difference of x and y
    sub = x - y;

    // Displaying the difference
    System.out.println("Sub is: " + sub);
  }
}