import java.util.*;
public class string_Even {
    public static void main(String[] args)
    {
    Scanner r = new Scanner(System.in);
    String s2;
    System.out.println("Enter the first string : ");
    String s1=r.nextLine();
    int l=s1.length();
    int m=l/2;
    if(l%2==0)
    {
        s2=s1.substring(0,m);
        System.out.println("String after concating : "+s2);
    }
    else
    {
        System.out.println("NULL");
    }
    }
}