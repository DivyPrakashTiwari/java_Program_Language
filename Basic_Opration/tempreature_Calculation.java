public class tempreature_Calculation {

    public static void main(String[] args) {
        // Initialize a variable c to store the temperature in Celsius
        double c = 4.6;

        // Convert the temperature from Celsius to Fahrenheit using the formula: Fahrenheit = (Celsius * 9/5) + 32
        double f = (c * (9 / 5)) + 32;

        // Print the temperature in Celsius
        System.out.println("Temprature in Celcius : " + c);

        // Print the temperature in Fahrenheit
        System.out.println("Temprature in Fahrenheit : " + f);
    }
}