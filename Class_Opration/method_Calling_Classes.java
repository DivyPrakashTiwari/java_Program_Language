import java.util.*;

// Abstract class dc representing a parent class
class dc {
    // Instance variable v1 with a value of 7
    int v1 = 7;

    // Method m1 to print a message indicating it's the parent class
    void m1() {
        System.out.println("parent class");
    }
}

// Class sdc extending the parent class dc
class sdc extends dc {
    // Overriding instance variable v1 with a value of 77
    int v1 = 77;

    // Overriding method m1 to print a message indicating it's the child class
    void m1() {
        System.out.println("child class");
    }
}

// Main class j3 containing the main method
class method_Calling_Classes {
    // Main method to test the classes and their methods
    public static void main(String[] args) {
        // Creating an object obj1 of type dc
        dc obj1 = new dc();
        // Calling method m1 on obj1, which will print "parent class"
        obj1.m1();

        // Creating an object obj2 of type dc, but instantiating it with a sdc object
        dc obj2 = new sdc();
        // Calling method m1 on obj2, which will print "child class" due to polymorphism
        obj2.m1();

        // Creating an object obj3 of type sdc
        sdc obj3 = new sdc();
        // Calling method m1 on obj3, which will print "child class"
        obj3.m1();

        // Creating another object obj4 of type sdc (not used in this example)
        sdc obj4 = new sdc();
        // Calling method m1 on obj2 again, which will still print "child class"
        obj2.m1();
    }
}