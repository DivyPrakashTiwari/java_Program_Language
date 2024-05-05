// This is a Java program that takes in three floating point numbers as command-line arguments
// and prints out the largest of the three numbers
public class max_Number {
  public static void main(String[] m) {
      // Parse the first command-line argument as a float and store it in variable 'a'
      float a = Float.parseFloat(m[0]);

      // Parse the second command-line argument as a float and store it in variable 'b'
      float b = Float.parseFloat(m[1]);

      // Parse the third command-line argument as a float and store it in variable 'c'
      float c = Float.parseFloat(m[2]);

      // Initialize the variable 'max' to the largest of the three numbers
      float max;
      if (a > b) {
          if (a > c) {
              max = a;
          } else {
              max = c;
          }
      } else {
          if (b > c) {
              max = b;
          } else {
              max = c;
          }
      }

      // Print out the largest of the three numbers
      System.out.println("Maximum of the numbers: " + max);
  }
}