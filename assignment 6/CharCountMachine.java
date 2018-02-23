//Assignment 6.1
/* In this program, the machine will count the number of times a specific char value occurs in a series of char
   values in an array, and display the results to the user. */
import java.util.Scanner;
import java.io.*;

class CharCountMachine
{
   public static void main(String[] args)
   {
      Scanner k = new Scanner(System.in);
      
      char[] array = { 'a','s','y','u','y','m','n','b','f','e','w','f','f','a','s','y','p','b','y'};
      String yourChar;
      
      System.out.print("Enter the letter you want to search for: ");
      yourChar = k.nextLine();
      
      int countChar = 0;
      int x = 0;
      char searchChar = yourChar.charAt(0);
      
      countChar = charSearch(array, searchChar, x);
      
      System.out.print("This letter appears " + countChar + " times in the array!");
   }
   
   public static int charSearch(char[] array, char searchChar, int x)
   {
      if(x < array.length)
         if(array[x] == searchChar)
            return (1 + charSearch(array, searchChar, x+1));
         else
            return (charSearch(array, searchChar, x+1));
      else
         return 0;
   }
}
      
      