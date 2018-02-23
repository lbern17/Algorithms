// Assignment 3.1
/* In this assignment, the bubbleSort method will be modified to use a Bidirection approach to sorting numnbers. */

class ArrayBub
   {
   private long[] a;                 
   private int nElems;              

   public ArrayBub(int max)          
      {
      a = new long[max];                 
      nElems = 0;                        
      }
   public void insert(long value)    
      {
      a[nElems] = value;            
      nElems++;                      
      }

   public void display()            
      {
      for(int j=0; j<nElems; j++)       
         System.out.print(a[j] + " ");  
      System.out.println("");
      }
   
   public void bubbleSort()
   //--------NEW CODE ADDED BELOW!---------//
      {
      int outl; //Represents the leftmost end of the array
      int outr; //Represents the rightmost end of the array
      int in;
      
      outl = 0; //Initialized as the leftmost array value, naturally
      outr = nElems - 1; //Initialized as the rightmost array value, of course
      
         while(outl < outr) /* A while loop that runs while the leftmost array value is smaller 
                              than the rightmost array value */
         {
            for(in = outl; in < outr; in++) //A for loop that carries largest leftmosr value to the right
              if(a[in] > a[in+1]) //If the leftmost value is bigger than the rightmost...
                 swap(in, in+1); //The values are swapped, and the leftmost value is moved to the right!
                 outr--;
            for(in = outr; in > outl; in--) // Once that for loop is over, this for loop carries the smallest
                                            //rightmost value to the left
              if(a[in-1] > a[in]) //If the leftmostmost value is greater than the lightmost value...
                 swap(in, in-1); //The values are swapped, and te rightmost value is moved to the left!
                 outl++; 
         }
     }
//-------------END OF NEW CODE!-----------------//
   private void swap(int one, int two)
      {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
      }

   }  
class BubbleSortApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;           
      ArrayBub arr;                 
      arr = new ArrayBub(maxSize);  

      arr.insert(77);               
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      arr.display();                

      arr.bubbleSort();             //Calls the arr object and runs the new bubbleSort method

      arr.display();                //Displays the sort
      
      } 
   }  
