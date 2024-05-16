import pack.addition;
import pack.subtraction;
import java.util.Scanner; 
class j3 {
  public static void main(String[] args) {
    int x, y, sum, sub;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter a first no:");
    x = myObj.nextInt(); 
    System.out.println("Enter a second no:");
    y = myObj.nextInt(); 
    sum = x + y;  
    System.out.println("Sum is: " + sum);
    sub = x - y;  
    System.out.println("Sub is: " + sub); 