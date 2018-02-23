//assignment 7.1
/* In this program, I will modify the  existing PartitionIt method to where the pivot is the highest-index 
   element (or the rightmost value), rather than an arbitrary number. It will be able to work with arrays 
   of three or fewer elements. */
class ArrayPar
   {
   private long[] theArray;          
   private int nElems;               

   public ArrayPar(int max)          
      {
      theArray = new long[max];     
      nElems = 0;                    
      }

   public void insert(long value)    
      {
      theArray[nElems] = value;      
      nElems++;                      
      }

   public int size()                
      { return nElems; }

   public void display()            
      {
      System.out.print("A=");
      for(int j=0; j<nElems; j++)    
         System.out.print(theArray[j] + " ");  
      System.out.println("");
      }
// NEW CODE BEGINS BELOW
    public int partitionIt(int left, int right)
       {
          int leftPtr = left - 1;           
          int rightPtr = right;         
         
          if(rightPtr - leftPtr <= 0)
          {
             System.out.print("Too small to sort!");
             return -1;
          }
         
          long pivot = theArray[right];  
          System.out.println("Pivot: " + pivot);
          
          while(true)
          {
            while(leftPtr < right && theArray[++leftPtr] < pivot);
            while(leftPtr < left && theArray[--rightPtr] < pivot);
            if(leftPtr >= rightPtr)
               break;
            else
               swap(leftPtr, rightPtr);
         }  
         
         swap(leftPtr, right);
         return leftPtr;                
       }  
// NEW CODE ENDS
   public void swap(int dex1, int dex2)  
      {
      long temp;
      temp = theArray[dex1];             
      theArray[dex1] = theArray[dex2];   
      theArray[dex2] = temp;             
      }  

   }  

class PartitionApp
   {
   public static void main(String[] args)
      {
      int maxSize = 15;             
      ArrayPar arr;                 
      arr = new ArrayPar(maxSize);  

      for(int j=0; j<maxSize; j++)  
         {                          
         long n = (int)(java.lang.Math.random()*199);
         arr.insert(n);
         }
      arr.display();               
      arr.partitionIt(0, maxSize-1);
      arr.display();                
      }  
   }
