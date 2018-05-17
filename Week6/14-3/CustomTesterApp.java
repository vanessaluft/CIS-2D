import java.io.*;


public class CustomTesterApp
{
    public static void main(String[] args)
    {
        Method1();
    }

    public static void Method1()
    {
        Method2();
    }

    public static void Method2()
    {
        try{
          Method3();  
        }
        catch (TestException e){
           
            System.out.println("Test Exception");
        }
        
    }

    public static void Method3() throws TestException
    {
               
        try{
            throw new IOException();
        }
        catch (IOException e) {
            throw new TestException(e);
            
        }
    }
}
