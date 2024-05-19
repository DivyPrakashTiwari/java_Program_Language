import java.util.*;

public class transport_Calculator {
    public static void main(String a[]) {
        // Initialize charge and weight variables
        int chrg = 0, w;
        // Initialize city variable
        char city;
        // Set initial charge value
        chrg = 10;
        // Set initial city value
        city = 'a';
        // Initialize Scanner object
        Scanner v = new Scanner(System.in);
        // Initialize operation variable
        char op = 'y';

        // Loop while operation is 'y'
        while (op == 'y') {
            // Prompt user to enter weight
            System.out.println("enter the weight");
            // Read weight input
            w = v.nextInt();
            // Prompt user to enter city
            System.out.println("enter the city");
            // Read city input
            city = v.next().charAt(0);

            // Check city and calculate charge accordingly
            if (city == 'k') {
                // Check weight and calculate charge accordingly
                if (w <= 100) {
                    chrg = w * 45;
                    System.out.println("The charge is " + chrg + " $");
                } else {
                    chrg = 75 * (w - 100) + (100 * 45);
                    System.out.println("The charge is" + chrg + "$");
                }
            } else if (city == 'm') {
                if (w <= 100) {
                    chrg = w * 65;
                    System.out.println("The charge is" + chrg + "$");
                } else {
                    chrg = w * 95;
                    System.out.println("The charge is" + chrg + "$");
                }
            } else if (city == 'c') {
                if (w <= 100) {
                    chrg = w * 75;
                    System.out.println("The charge is" + chrg + "$");
                } else {
                    chrg = w * 155;
                    System.out.println("The charge is" + chrg + "$");
                }
            } else if (city == 'd') {
                if (w <= 100) {
                    chrg = w * 90;
                    System.out.println("The charge is" + chrg + "$");
                } else {
                    chrg = w * 125;
                    System.out.println("The charge is" + chrg + "$");
                }
            } else {
                System.out.println("humpe tho hi no");
            }

            // Prompt user to continue
            System.out.println("do you want to continue y/n");
            // Read operation input
            op = v.next().charAt(0);
        }
    }
}