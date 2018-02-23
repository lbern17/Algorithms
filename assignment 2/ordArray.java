// assignment 2.4
/* In this program, the original code will be modified so that insert, delete, and find all use binary searches.
*/
class OrdArray
   {
   private long[] a;               
   private int nElems;               
   
   public OrdArray(int max)         
      {
      a = new long[max];             
      nElems = 0;
      }
   
   public int size()
      { return nElems; }
      
   public int find(long searchKey)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn]==searchKey)
            return curIn;             
         else if(lowerBound > upperBound)
            return nElems;            
         else                          
            {
            if(a[curIn] < searchKey)
               lowerBound = curIn + 1;
            else
               upperBound = curIn - 1; 
            }  
         }  
      } 
   //Code is modified below
   public void insert(long value)    
      {
         int lowerBound = 0; //Lower bounds are initialized at 0.
         int upperBound = nElems -1; //Upper bounds are initialized as nElems minus 1.
         int curIn = 0; //Insert is initialized at 0.
         
         while(true)
         {
            curIn = (lowerBound + upperBound)/2; //Binary search is inserted into code.
            if(a[curIn] > value)
            {
               upperBound = curIn -1; //Upper bounds subtracted by 1.
               lowerBound = curIn +1; //Lower bounds increased by 1.
               
               if(upperBound < lowerBound)
               {
                  curIn = lowerBound; //If upper bounds are less than lower bounds, the value of in is equated to the lower bounds.
                  break;
               }
           }
            
      int j; //Original value from previous code repurposed.
      for(j=nElems; j > curIn; j--)
      {
         a[j] = a[j-1]; //The rest of the arrays move up one.
         a[curIn] = value;
         nElems++;
      }      
      //End of mods for Insert                     
      } 
   } 
      
   public boolean delete(long value)
      {
      int j = find(value);
      if(j==nElems)               
         return false;
      else                           
         {
         for(int k=j; k<nElems; k++) 
            a[k] = a[k+1];
         nElems--;                 
         return true;
         }
      } 
      
   public void display()             
      {
      for(int j=0; j<nElems; j++)       
         System.out.print(a[j] + " ");  
      System.out.println("");
      }
  
   }  

class OrderedApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;           
      OrdArray arr;                  
      arr = new OrdArray(maxSize);  

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

      int searchKey = 55;            
      if( arr.find(searchKey) != arr.size() )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.display();               

      arr.delete(00);                
      arr.delete(55);
      arr.delete(99);

      arr.display();               
      } 
   } 
