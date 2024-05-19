// Importing the Scanner class to take input from the user
import java.util.Scanner;

public class demostrating_Class {
    public static void main(String[] args) {
        // Printing the initial ID value
        System.out.println(Emp.getId());

        // Setting a new ID value
        int id = 449;
        Emp.setId(id);

        // Printing the updated ID value
        System.out.println(Emp.getId());

        // Printing the initial Student name
        System.out.println(Student.getName());

        // Setting a new Student name
        String n = "divri";
        Student obj = new Student();
        obj.setName(n);

        // Printing the updated Student name
        System.out.println(Student.getName());

        // Creating an instance of the tt class with two integer values
        tt ob = new tt(10, 30);

        // Printing the instance of the tt class
        System.out.println(ob);
    }
}

// Class for storing and managing employee information
class tt {
    // Private integer variables for storing two values
    private int a, b;

    // Constructor for initializing the two integer variables
    public tt(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Overriding the toString method to print the two integer values
    public String toString() {
        return this.a + ", " + this.b;
    }
}

// Class for storing and managing employee information
class Emp {
    // Private static integer variable for storing the employee ID
    private static int id;

    // Private static string variable for storing the employee name
    private static String name;

    // Private static double variable for storing the employee salary
    private static double salary;

    // Getter method for retrieving the employee ID
    public static int getId() {
        return Emp.id;
    }

    // Setter method for setting the employee ID
    public static void setId(int id) {
        Emp.id = id;
    }

    // Getter method for retrieving the employee name
    public static String getName() {
        return Emp.name;
    }

    // Setter method for setting the employee name
    public static void setName(String name) {
        Emp.name = name;
    }

    // Getter method for retrieving the employee salary
    public static double getSalary() {
        return Emp.salary;
    }

    // Setter method for setting the employee salary
    public static void setSalary(double salary) {
        Emp.salary = salary;
    }
}

// Class for storing and managing student information
class Student {
    // Private static string variable for storing the student name
    private static String name;

    // Private static string variable for storing the student course
    private static String course;

    // Private static double variable for storing the student fee
    private static double fee;

    // Getter method for retrieving the student name
    public static String getName() {
        return Student.name;
    }

    // Setter method for setting the student name
    public static void setName(String name) {
        Student.name = name;
    }

    // Getter method for retrieving the student course
    public static String getCourse() {
        return Student.course;
    }

    // Setter method for setting the student course
    public static void setCourse(String course) {
        Student.course = course;
    }

    // Getter method for retrieving the student fee
    public static double getFee() {
        return Student.fee;
    }

    // Setter method for setting the student fee
    public static void setFee(double fee) {
        Student.fee = fee;
    }
}