// This is a Java program that takes in a variable number of command-line arguments
// and prints out each argument along with its index
public class j4 {
  public static void main(String[] d) {
      // Print out a header for the list of command-line arguments
      System.out.println("Command line arguments:");

      // Iterate through the array of command-line arguments
      for (int i = 0; i < d.length; i++) {
          // Print out the current argument along with its index
          System.out.println("argument" + (i + 1) + ": " + d[i]);
      }
  }
}