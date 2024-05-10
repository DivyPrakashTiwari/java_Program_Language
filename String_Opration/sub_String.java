import java.util.*;
public class sub_String {
    public static void main(String[] args)
    {
    Scanner r = new Scanner(System.in);
    String s2;
    System.out.println("Enter the first string : ");
    String s1=r.nextLine();
    int l=s1.length();
    int m=l;
    s2=s1.substring(1,m);
        System.out.println("NEW STRING "+s2);
    }
}