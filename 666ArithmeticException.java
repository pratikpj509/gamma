import java.util.*;


public class Main
{
    public static void main (String args[])
    {
       Scanner sc= new Scanner(System.in);
       
       try
       {
          System.out.println("\nEnter the first number: ");
          int num1=sc.nextInt();
          System.out.println("\nEnter the second number: ");
          int num2=sc.nextInt();
          int q=num1/num2;
          System.out.println("\nQuotient is: "+q);
        }
          catch(ArithmeticException e)
        {
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}
