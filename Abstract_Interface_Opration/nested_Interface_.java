// Interface i1 with a nested interface i2
interface i1
{
    // Method declaration for i1m in interface i1
    void i1m();

    // Nested interface i2 within interface i1
    interface i2
    {
        // Method declaration for i2m in interface i2
        void i2m();
    }
}

// Class j5 implementing the nested interface i1.i2
class nested_Interface_ implements i1.i2
{
    // Implementation of i1m from interface i1
    public void i1m()
    {
        System.out.println("Implementation of Interface1");
    }

    // Implementation of i2m from interface i2
    public void i2m()
    {
        System.out.println("Implementation of Interface2");
    }

    // Main method to test the implementation
    public static void main(String[] args)
    {
        nested_Interface_ obj = new nested_Interface_();
        obj.i1m();
        obj.i2m();
    }
}