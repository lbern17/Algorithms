//assignment 6.4
/* In this program, a recursive program will accept a string as an argument and return it in reverse order. */
import java.util.Scanner;
import java.io.*;

class StringReverseMachine
{
   public static void main(String[] args)
   {
      Scanner k = new Scanner(System.in);
      
      String word;
      
      System.out.print("Put a word in here: ");
      word = k.nextLine();
      
      StringReverse(word,(word.length()-1));
   }
   
   public static void StringReverse(String word, int x)
   {
      if(x >= 0)
      {
         System.out.print(word.charAt(x));
            StringReverse(word, x-1);
      }
   }
}