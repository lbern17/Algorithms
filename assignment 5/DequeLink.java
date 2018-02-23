//Assignment 5.2
/* In this assignment, I will base a deque on a doubley linked list, wherein the deque will function as it
   normally does. */
class DequeLink
{
   public long data;
   public DequeLink next;
   public DequeLink previous;
   
   public DequeLink(long v)
   {
      data = v;
   }
   
   public void display()
   {
      System.out.println(data + " ");
   }
   
}

class DoubleyLinkedList
{
   private DequeLink front;
   private DequeLink back;
   
   public DoubleyLinkedList()
   {
      front = null;
      back = null;
   }
   
   public boolean isEmpty()
   {
      return front == null;
   }
   
   public void insertFirst(long v)
   {
      DequeLink link = new DequeLink(v);
      
      if(isEmpty())
         back = link;
      else
         front.previous = link;
      link.next = front;
      front = link;
   }
   
   public void insertLast(long v)
   {
      DequeLink link = new DequeLink(v);
      
      if(isEmpty())
         front = link;
      else
      {
         back.next = link;
         link.previous = back;
      }
      back = link;
   }
   
   public DequeLink deleteFirst()
   {
      DequeLink temp = front;
      if(front.next == null)
         back = null;
      else
         front.next.previous = null;
      front = front.next;
      return temp;
   }
   
   public DequeLink deleteLast()
   {
      DequeLink temp = back;
      if(back.previous == null)
         front = null;
      else
         back.previous.next = null;
      back = back.previous;
      return temp;
   }
   
   public boolean insertAfter(long key, long v)
   {
      DequeLink current = front;
      while(current.data != key)
      {
         current = current.next;
         if(current == null)
            return false;
      }
      
      DequeLink link = new DequeLink(v);
      
      if(current == back)
      {
         link.next = null;
         back = link;
      }
      else
      {
         link.next = current.next;
         current.next.previous = link;
      }
      
      current.next = link;
      link.previous = current;
      return true;
   }
   
   public DequeLink deleteKey(long v)
   {
      DequeLink current = front;
      while(current.data != v)
      {
         current = current.next;
         if(current == null)
         {
            System.out.println("Could Not Find " + v + "! Sorry, amigo!");
            return null;
         }
      }
      if(current == front)
         front = current.next;
      else
         current.previous.next = current.next;
      if(current == back)
         back = current.previous;
      else
         current.next.previous = current.previous;
      return current;
   }
   
   public void displayForward()
   {
      DequeLink current = front;
      System.out.println("List (First------->Last)");
      while(current != null)
      {
         System.out.println(current.data + " ");
         current = current.next;
      }
      System.out.println(" ");
   }
   
   public void displayBackward()
   {
      DequeLink current = back;
      System.out.println("List (Last------->First)");
      while(current != null)
      {
         System.out.println(current.data + " ");
         current = current.previous;
      }
      System.out.println(" ");
   }
   
   public DequeLink peekFirst()
   {
      return front;
   }
   
   public DequeLink peekLast()
   {
      return back;
   }
   
}

class DequeWithDLL
{
   private DoubleyLinkedList dll;
   
   public DequeWithDLL()
   {
      dll = new DoubleyLinkedList();
   }
   
   public long peekLeft()
   {
      return dll.peekFirst().data;
   }
   public long peekRight()
   {
      return dll.peekLast().data;
   }
   public void insertLeft(long v)
   {
      dll.insertFirst(v);
   }
   public long removeLeft()
   {
      return dll.deleteFirst().data;
   }
   public void insertRight(long v)
   {
      dll.insertLast(v);
   }
   public long removeRight()
   {
      return dll.deleteLast().data;
   }
   public boolean isEmpty()
   {
      return dll.isEmpty();
   }
   public void display()
   {
      dll.displayForward();
   }
}

class DequeDLLMain
{
   public static void main(String[] args)
   {
      DequeWithDLL d = new DequeWithDLL();
      
      d.insertLeft(1);
      d.insertLeft(15);
      d.insertLeft(45);
      
      d.insertRight(18);
      d.insertRight(115);
      d.insertRight(56);
      
      d.display();
      
      System.out.println("Let's peek left... " + d.peekLeft());
      d.removeLeft();
      System.out.println("We removed one from the left, now peek again... " + d.peekLeft());
      
      d.removeRight();
      d.removeRight();
      d.insertRight(1252);
      
      d.display();
   }
}