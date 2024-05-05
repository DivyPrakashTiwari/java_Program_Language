import java.util.*;

public class simple_Intrest {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner r = new Scanner(System.in);
        
        // Declare variables to store the principle value, rate per annum, time of maturity, simple interest, and amount
        double p, rt, t, si, a;
        
        // Prompt the user to enter the principle value
        System.out.print("Enter the Princple value : ");
        // Read the principle value from the user
        p = r.nextDouble();
        
        // Prompt the user to enter the rate per annum
        System.out.print("Enter the Rate per annum : ");
        // Read the rate per annum from the user
        rt = r.nextDouble();
        
        // Prompt the user to enter the time of maturity
        System.out.print("Enter the Time of maturity : ");
        // Read the time of maturity from the user
        t = r.nextDouble();
        
        // Calculate the simple interest using the formula: (p * rt * t) / 100
        si = (p * rt * t) / 100;
        
        // Calculate the amount by adding the simple interest to the principle value
        a = si + p;
        
        // Print the simple interest
        System.out.println("Simple Intrest :  " + si);
        
        // Print the amount
        System.out.println("Amount :  " + a);
    }
}