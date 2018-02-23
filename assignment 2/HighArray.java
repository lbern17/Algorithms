// assignment 2.2
/* In this program, the HighArray class will be modified with a getMax method that will return the highest number, 
and a removeMax method that will remove the highest value of the array.*/

class HighArray
   {
   private long[] a; 
   private int nElems;         

   public HighArray(int max) 
      {
      a = new long[max];                 
      nElems = 0;                        
      }

   public boolean find(long searchKey)
      {                              
      int j;
      for(j=0; j<nElems; j++)           
         if(a[j] == searchKey)          
            break;                       
      if(j == nElems)                    
         return false;                   
      else
         return true;                   
      } 
   
   public void insert(long value)   
      {
      a[nElems] = value;            
      nElems++;                      
      }
   
   public boolean delete(long value)
      {
      int j;
      for(j=0; j<nElems; j++)        
         if( value == a[j] )
            break;
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
/* Code mods begin here. */
      
   public long getMax() //The method that returns the largest value in the array.
   {
      //This if statement determines which value in the array is the lergest and identifies it with the value 1.
      if(nElems == 0)
      {
      return 1;
      }
      //The long Max is intitialized with 0.
      long Max = a[0];
      //This for loop finds the actual largest number amongst the array values and retutns it as Max.
      for(int x = 1; x < nElems; x++)
      {
         if(Max < a[x])
         {
            Max = a[x];
         }
      }
      return Max;
   }
   
   public boolean removeMax() //The method to eliminate the largest value in the array.
   {
      //This if statement finds the 1 identifier from the loop in the getMax method.
      if(getMax() == 1)
      {
         return false;
      }
      
      //The largest value in the array is eliminated.
      return delete(getMax());
   }
   }  

class HighArrayApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            
      HighArray arr;                
      arr = new HighArray(maxSize); 

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

      int searchKey = 35;           
      if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.delete(00);               
      arr.delete(55);
      arr.delete(99);

      arr.display();   
      /* Modified display code below. */
      System.out.println(arr.getMax()); //First go will display 88
      arr.removeMax();                  // 88 is eliminated
      System.out.print(arr.getMax());   //New Max, 77, is displayed          
      } 
   }  

