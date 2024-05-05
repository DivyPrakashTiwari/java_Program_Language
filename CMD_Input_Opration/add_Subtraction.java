// Java program to calculate the sum and difference of three numbers

public class add_Subtraction {
  public static void main(String[] s) {
      // Parse the command-line arguments as integers
      int a = Integer.parseInt(s[0]);
      int b = Integer.parseInt(s[1]);
      int c = Integer.parseInt(s[2]);

      // Calculate the sum and difference of the numbers
      int sum = a + b + c;
      int dif = a - b - c;

      // Print the results
      System.out.println("Sum of the numbers: " + sum);
      System.out.println("Difference of the numbers: " + dif);
  }
}