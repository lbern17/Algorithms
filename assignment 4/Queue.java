//Assignment 4.1
/* For this assignment, I will add a "display" method that will display the content in the queue, using the 
instructions given in the book. */
class Queue
   {
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;

   public Queue(int s)
      {
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
      }

   public void insert(long j)
      {
      if(rear == maxSize-1)  
         rear = -1;
      queArray[++rear] = j;    
      nItems++;   
      }

   public long remove()    
      {
      long temp = queArray[front++]; 
      if(front == maxSize)     
         front = 0;
      nItems--;        
      return temp;
      }

   public long peekFront()  
      {
      return queArray[front];
      }

   public boolean isEmpty()  
      {
      return (nItems==0);
      }

   public boolean isFull()   
      {
      return (nItems==maxSize);
      }

   public int size()     
      {
      return nItems;
      }
      /* NEW CODE BEGINS HERE */
      
   public void display()
      {
         System.out.println("Items in the Queue, from first inserted to last inserted: ");
         
         if(isEmpty())
         {
            System.out.print("The queue is empty! Sorry, amigo!");
         }
         else if(rear < front)
         {
            for(int x = front; x < maxSize; x++)
            {
               System.out.println(queArray[x]);
            }
            for(int x = 0; x <= rear; x++)
            {
               System.out.println(queArray[x]);
            }
         }
         else if(front >= rear)
         {
            for(int x = front; x <= rear; x++)
            {
               System.out.println(queArray[x]);
            }
         }
      } 
      /* END OF NEW CODE */
   }  

class QueueApp
   {
   public static void main(String[] args)
      {
      Queue theQueue = new Queue(5); 

      theQueue.insert(10);     
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);

      theQueue.remove();          
      theQueue.remove();          
      theQueue.remove();

      theQueue.insert(50);            
      theQueue.insert(60);          
      theQueue.insert(70);
      theQueue.insert(80);
      
      theQueue.display(); // The new display method in use, with elements...
      
      while( !theQueue.isEmpty() )    
         {                          
         long n = theQueue.remove();  
         System.out.print(n);
         System.out.print(" ");
         }
      theQueue.display(); // ...and without
      
      System.out.println("");
      }  
   } 
