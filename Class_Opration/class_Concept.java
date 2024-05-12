import java.util.*;

// This is a base class for all shapes
class shape
{
    // A Scanner object to read input from the user
    Scanner r = new Scanner(System.in);

    // Length, breadth, and side of a shape
    int l = r.nextInt();
    int b = r.nextInt();
    int s = r.nextInt();
}

// A rectangle is a shape with a length and breadth
class rectangle extends shape
{
    // The area of the rectangle is the product of its length and breadth
    int area = l * b;

    // Method to display the area of the rectangle
    void showr()
    {
        System.out.println("the area of rectangle = " + area);
    }
}

// A square is a shape with all sides equal
class square extends shape
{
    // The area of the square is the square of its side
    int area = s * s;

    // Method to display the area of the square
    void shows()
    {
        System.out.println("the area of square = " + area);
    }
}

// This class contains the main method
class class_Concept
{
    public static void main(String[] args)
    {
        // Create an instance of the rectangle class
        rectangle re = new rectangle();

        // Create an instance of the square class
        square sq = new square();

        // Display the area of the square
        sq.shows();

        // Display the area of the rectangle
        re.showr();
    }
}