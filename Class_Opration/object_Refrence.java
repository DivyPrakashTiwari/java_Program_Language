// Import necessary libraries
import java.util.*;

// Define class c1 with a method m() and m2()
class c1 {
  // Method m() prints a message and initializes an integer array and a character array
  public void m() {
    int a[] = {11, 31};
    char aa[] = {'1', 1};
    double b = 1;
    System.out.println("method of class 1");
  }

  // Method m2() prints a message
  public void m2() {
    System.out.println("method2 of class 1");
  }
}

// Define class c2 that extends class c1 and overrides method m()
class c2 extends c1 {
  // Override method m() to print a different message
  public void m() {
    System.out.println("method of class 2");
  }
}

// Define class tt that extends class c2
public class object_Refrence extends c2 {
  // Main method that creates instances of classes c1, c2, and tt, and calls their methods
  public static void main(String t[]) {
    c1 obj1 = new c1();
    obj1.m();
    obj1.m2();

    c1 obj11 = new c1();
    obj11.m();

    c1 obj12 = new c1();
    obj12.m();

    c1 obj13 = new c1();
    obj13.m2();
    obj13.m2();

    c2 obj2 = new c2();
    obj2.m();

    tt obj = new tt();
    obj.m();

    // Create a Scanner object to read input from the user
    Scanner s = new Scanner(System.in);

    // Read a string from the user and print it
    String s1 = s.next();
    System.out.println(s1);

    // Read another string from the user and print it
    String s3 = s.next();
    System.out.println(s3);

    // Read a line of text from the user and print it
    String s2 = s.nextLine();
    System.out.println(s2);

    // Print the sum of 5 and a comma
    System.out.println(5 + ",");
  }
}