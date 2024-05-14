import java.util.*;
class arithmetic_Exception
{
    public static void main(String [] args)
    {
    System.out.println("no exception");
    try
    {
        int arr[]={1,2,3};
        System.out.println("exception"+arr[3]);
        int k=10/0;
    }
    catch(ArithmeticException f)
    {
        System.out.println(f);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}