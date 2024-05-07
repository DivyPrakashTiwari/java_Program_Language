import java.util.*;
public class j3 {
    public static void main(String[] args)
    {
    Scanner r = new Scanner(System.in);
    int i,c=0,n;
    System.out.print("Enter the year : ");
    n=r.nextInt();
    if(n%4==0)
    {
        System.out.println("leap year");
    }
    else
    {
        if(n%400==0)
        {
            System.out.println("laep year");
        }
        else{
        System.out.println("not a leap year");
        }
    }
    }
}
