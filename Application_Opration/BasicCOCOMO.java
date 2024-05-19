import java.util.Arrays; // Importing the Arrays class from java.util package

public class BasicCOCOMO {

    // Declaring a 2D array TABLE with 3 rows and 4 columns
    private static final double[][] TABLE = {

        {2.4, 1.05, 2.5, 0.38}, // Organic mode coefficients

        {3.0, 1.12, 2.5, 0.35}, // Semi-Detached mode coefficients

        {3.6, 1.20, 2.5, 0.32} // Embedded mode coefficients
    };

    // Declaring a String array MODE with 3 elements
    private static final String[] MODE = {

        "Organic", // Mode 0
        "Semi-Detached", // Mode 1
        "Embedded" // Mode 2
    };

    // Method to calculate effort, time, and average staff required based on project size
    public static void calculate(int size) {

        int model = 0; // Initializing model to 0 (Organic mode)

        // Check the mode according to size
        if (size >= 2 && size <= 50) {

            model = 0; // Organic mode

        } else if (size > 50 && size <= 300) {

            model = 1; // Semi-Detached mode

        } else if (size > 300) {

            model = 2; // Embedded mode

        }

        System.out.println("The mode is " + MODE[model]); // Print the selected mode

        // Calculate Effort
        double effort = TABLE[model][0] * Math.pow(size, TABLE[model][1]);

        // Calculate Time
        double time = TABLE[model][2] * Math.pow(effort, TABLE[model][3]);

        // Calculate Persons Required
        double staff = effort / time;

        // Output the values calculated
        System.out.println("Effort = " + Math.round(effort) + " Person-Month");
        System.out.println("Development Time = " + Math.round(time) + " Months");
        System.out.println("Average Staff Required = " + Math.round(staff) + " Persons");
    }

    public static void main(String[] args) {

        int size = 4; // Set project size to 4
        calculate(size); // Call calculate method with size as parameter
    }
}