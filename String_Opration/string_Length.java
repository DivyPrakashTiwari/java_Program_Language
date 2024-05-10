import java.util.*;
public class string_Length {
    public static void main(String[] args)
    {
    Scanner r = new Scanner(System.in);
    String s2;
    System.out.println("Enter the first string : ");
    String s1=r.nextLine();
    System.out.println("String after concating : ");
    s2=s1.substring(0,2);
    for(int i=0;i<s1.length();i++)
    {
    s2=s2+s2;
    }
    System.out.print(s2);
    }
}