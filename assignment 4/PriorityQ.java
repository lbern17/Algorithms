// Assignment 4.4
/* In this assignment, I will change this priority queue to have O(1) insertion time and a slower removal time, 
   and will also add a modified version of the "display" method created in assignment 4.1 to display the contents 
   of the queue. */
   
class PriorityQ
   {
   
   private int maxSize;
   private long[] queArray;
   private int nItems;

   public PriorityQ(int s)          
      {
      maxSize = s;
      queArray = new long[maxSize];
      nItems = 0;
      }
   /* NEW CODE BEGINS HERE */
   public void insert(long item)
      {
         queArray[nItems] = item;
         nItems++;
      }

   public long remove()        
      { 
         int indexNum = 0;
         long tempNum;
         
         tempNum = queArray[0];
         
         for(int x = 0; x < nItems; x++)
         {
            if(queArray[x] < tempNum)
            {
               tempNum = queArray[x];
               indexNum = x;
            }
         }
         for(int j = indexNum; j < nItems - 1; j++)
         {
             queArray[j] = queArray[j + 1];
         }
         
         nItems--;
         return tempNum;
      }
      /* NEW CODE ENDS HERE */

   public long peekMin()         
      { return queArray[nItems-1]; }

   public boolean isEmpty()         
      { return (nItems==0); }

   public boolean isFull()          
      { return (nItems == maxSize); }
      
       /* DISPLAY METHOD CODE BEGINS HERE */
      
   public void display()
      {
         long ar[] = new long[nItems];
         
         if(nItems == 0)
         {
            System.out.println("No elements to display! Sorry, buckaroo!");
         }
         else
         {
            for(int y = 0; y < nItems; y++)
            {
               ar[y] = queArray[y];
            }
         
            for(int z = 0; z < nItems; z++)
            {
               System.out.println(ar[z] + "");
            }  
         }
         
      } 
      /* END OF NEW CODE */
   }  

class PriorityQApp
   {
   public static void main(String[] args)
      {
      PriorityQ thePQ = new PriorityQ(5);
      thePQ.insert(30);
      thePQ.insert(50);
      thePQ.insert(10);
      thePQ.insert(40);
      thePQ.insert(20);
      
      thePQ.display(); //New display method in use, with elements...
     
      while( !thePQ.isEmpty() )
         {
         long item = thePQ.remove();
         System.out.print(item + " "); 
         } 
         
      thePQ.display(); // ...and without
      
      System.out.println("");
      } 

   } 
