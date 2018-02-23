//Assignment 6.2
/* In this program, the program will use recursion to multiply two parameters passed into it, and return 
   the value. */
import java.util.Scanner;
import java.io.*;

class MultiplierMachine
{
   public static void main(String[] args)
   {
      int x;
      int y;
      int mult;
      
      Scanner k = new Scanner(System.in);
      
      System.out.print("Enter the first value: ");
      x = k.nextInt();
      System.out.print("Enter the second value: ");
      y = k.nextInt();
      
      mult = multRecursion(x,y);
      int multReg = x * y;
      
      System.out.println("When multiplied with recursion, you get... " + mult);
      System.out.println("When multiplied regularly, you get... " + multReg);
      
      if(mult == multReg)
         System.out.print("It worked!");
      else
         System.out.print("Hmmm....");
   }
   
   public static int multRecursion(int x, int y)
   {
      int num = y;
      if(x == 1)
         return num;
      else
         return num + multRecursion(x-1, y);
   }
}
         
