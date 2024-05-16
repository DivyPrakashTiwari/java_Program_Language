package pack; // package declaration indicating the package name

import java.util.Scanner; // import statement for the Scanner class to read input

public class packages { // public class declaration with class name 'j1'

// method to perform addition of two numbers
public static void main(String[] args) {
int x, y, sum; // declaration of variables x, y and sum

Scanner myObj = new Scanner(System.in); // creating an object of Scanner class

// prompt to enter the first number
System.out.println("Enter a first no:");
x = myObj.nextInt(); // reading the first number

// prompt to enter the second number
System.out.println("Enter a second no:");
y = myObj.nextInt(); // reading the second number

// performing addition of x and y
sum = x + y;

// displaying the sum
System.out.println("Sum is: " + sum);
}
}