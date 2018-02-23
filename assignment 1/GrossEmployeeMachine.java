//Assignment 2
/* In this program, the user will get the gross pay of an employee by first entering in the employee ID number,
entering in hours work, and rate of pay. */
import java.util.Scanner;

public class GrossEmployeeMachine
{
   public static void main(String[] args)
   {
      Scanner k = new Scanner(System.in);
      
      int[] empID = new int[7];
         empID[0] = 56666;
         empID[1] = 45555;
         empID[2] = 78888;
         empID[3] = 87777;
         empID[4] = 94444;
         empID[5] = 12345;
         empID[6] = 76555;
         
      int[] hours = new int[7];
      double[] payrate = new double[7];
      double[] wage = new double[7];
      
      for(int x=0; x <= 6; x++)
      {
         System.out.print("Enter employee " + empID[x] + "'s hours worked now: ");
            hours[x] = k.nextInt();
         System.out.print("Enter employee " + empID[x] + "'s pay rate now: ");
            payrate[x] = k.nextDouble();
            wage[x] = hours[x] * payrate[x];
      }
      
      System.out.println("---------------------------------------------------");
      System.out.println("Employee ID        Hours        Payrate        Wage");
      for(int x=0; x <= 6; x++)
      {
         System.out.println(empID[x] + "              " + hours[x] + "              " + payrate[x] + "            " + wage[x]);         
      }
   }
}