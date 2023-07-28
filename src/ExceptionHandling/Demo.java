package ExceptionHandling;


public class Demo {
    public static void main(String[] args) throws MyException {
        int a=5;
        int b=0;
      //  divide(5,0);
        String name="Adarsh";
        try {
            if (name.equals("Adarsh")) {
                throw new MyException("this is an error of myexception");
            }
        }
        catch(MyException e)
        {
            System.out.println(" this is my exception "+ e);
        }
        catch (ArithmeticException e)
        {
            System.out.println("this is an error ");
        }
        catch (Exception e)
        {
            System.out.println("this is due to string");
        }
        finally {
            System.out.println("this will execute no Matter what");
        }
    }
    static void  divide(int a,int b) throws ArithmeticException
    {
         //int c=a/b;
        //return c;
        if(b==0)
        {
            throw new ArithmeticException("Error is applied");
        }
        else {
            int c=a/b;
        }
    }
}
