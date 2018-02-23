//Assignment 1
/* In this program, a production worker will be entered into a database using attributes, sll of which will be
included in two classes, Employee and ProductionWorker, of which ProductionWorker will inhetir Employee. */
import java.util.Scanner;

public class EmployeeMachine
{
   public static void main(String[] args)
   {
      
      ProductionWorker pw = new ProductionWorker("Barry Allen", 123, 1975, 1, 12.50);
      
      System.out.println("Here is information on the employee: ");
      System.out.println("Name: " + pw.getName());
      System.out.println("ID Number: " + pw.getEmpNum());
      System.out.println("Hire Date: " + pw.getHireDate());
      System.out.println("Shift: " + pw.getShift());
      System.out.println("Pay Rate: " + pw.getPayRate());
   }
}