import java.util.*;

// This class is a parent class with two private and protected integer variables
class dc {
    private int v1 = 7;
    protected int v2 = 77;

    // This method prints the sum of v1 and v2
    void m1() {
        System.out.println("parent class" + v1 + v2);
    }
}

// This class extends the parent class and overrides the m1 method
class sdc extends dc {
    // This method prints v2 and v1 from the parent class
    void m1() {
        System.out.println("child class" + v2);
        System.out.println("child class" + v1);
    }
}

// This class contains the main method which creates an instance of sdc and calls the m1 method
class child_Classes {
    public static void main(String[] args) {
        sdc obj = new sdc();
        obj.m1();
    }
}