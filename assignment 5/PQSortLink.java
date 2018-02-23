//Assignment 5.1
/* In this program, I will take a priority queue and base it on a sorted link likst, the smallest key of which
   will be found and removed. */

class PQSortLink
{
   public long data;
   public PQSortLink next;
   public PQSortLink(long dd)
   {
      data = dd;
   }
   public void displayLink()
   {
      System.out.println(data + " ");
   }
}
    
class PQSort
{
   
   private PQSortLink first;

   public PQSort()
   {
      first = null;
   }
      
   public boolean isEmpty()         
   { 
      return (first == null); 
   }

   public void insert(long key)
   {
      PQSortLink link = new PQSortLink(key);
      PQSortLink previous = null;
      PQSortLink current = first;
         
      while(current != null && key > current.data);
      {
         previous = current;
         current = current.next;
      }
      if(previous == null)
         first = link;
      else
         previous.next = link;
            
      link.next = current;
   } 

   public PQSortLink remove()            
   {
      PQSortLink temp = first;
      first = first.next;
      return temp;
   }

   public void display()            
   { 
      System.out.print("List (First--->Last) : ");
      PQSortLink current = first;
      while(current != null)
      {
         current.displayLink();
         current = current.next;
      }
         System.out.println(" ");
   }
   
   public long getFirst()
   {
      return first.data;
   }
   
}  
   
class PQ
{
   PQSort queue;
   
   public PQ()
   {
      queue = new PQSort();
   }
   public void insert(long v)
   {
      queue.insert(v);
   }
   public PQSortLink remove()
   {
      if(queue.isEmpty())
      {
         System.out.println("Queue is Empty! Sorry amigo!");
         return null;
      }
      return queue.remove();
   }
   public long peekMin()
   {
      return queue.getFirst();
   }
   public boolean isEmpty()
   {
      return queue.isEmpty();
   }
   public void display()
   {
      queue.display();
   }
}
   
class PQSortApp
   {
   public static void main(String[] args)
      {
      PQ Q = new PQ();     
      Q.insert(1);
      Q.insert(50);
      Q.insert(10);
      
      long temp = Q.peekMin();
      System.out.println("The Min Value is... " + temp + "!");
      
      Q.remove();
      Q.remove();
      Q.display();
      
      Q.insert(40);
      Q.insert(20);
      Q.insert(100);
      Q.insert(521);
      
      Q.display();
      
      PQSortLink keyMaster = Q.remove();
      System.out.println(keyMaster.data);
      keyMaster = Q.remove();
      System.out.println(keyMaster.data);
      keyMaster = Q.remove();
      System.out.println(keyMaster.data);
      keyMaster = Q.remove();
      System.out.println(keyMaster.data);
      keyMaster = Q.remove();
      System.out.println(keyMaster.data);
      
      keyMaster = Q.remove();
   }

}

