// Assignment 3.4
/* In this program, the insertion sort previously used will be changed to a bubble sort.*/

class Person
   {
   private String lastName;
   private String firstName;
   private int age;
   
   public Person(String last, String first, int a)
      {                              
      lastName = last;
      firstName = first;
      age = a;
      }
   
   public void displayPerson()
      {
      System.out.print("   Last name: " + lastName);
      System.out.print(", First name: " + firstName);
      System.out.println(", Age: " + age);
      }
  
   public String getLast()          
      { return lastName; }
   }  
   
class ArrayInOb
   {
   private Person[] a;              
   private int nElems;               

   public ArrayInOb(int max)         
      {
      a = new Person[max];               
      nElems = 0;                        
      }

   public void insert(String last, String first, int age)
      {
      a[nElems] = new Person(last, first, age);
      nElems++;                          
      }

   public void display()             
      {
      for(int j=0; j<nElems; j++)       
         a[j].displayPerson();          
      }
//-------------NEW CODE ADDED BELOW!----------------//
   public void bubbleSort() //Insertion sort is now changed to Bubble sort
      {
      int in, out; //Original int values used for bubble sort
      Person swap = a[0]; //The Person variable, used for sorting the Person values

      for(out= nElems -1; out > 1; out--) //The bubble outer loop
          for(in = 0; in < out; in++) //The bubble inner loop
            if(a[in].getLast().compareToIgnoreCase(a[in+1].getLast())>0) /* An if statement used to compare the
                                                                            the last names of the different
                                                                            person variables. The case is ignored
                                                                            when comparing the last names. When the
                                                                            last name on the left needs to be 
                                                                            shifted... */
            {
               swap = a[in]; //The swap variable is initialized as the left variable.
               a[in] = a[in+1]; //The values of the left variable becomes the value of the right variable, moving the
                                //right variable left.
               a[in+1] = swap; //The right variable is changed to the value of the left variable, moving the left
                               //variable right.
            }
      } 
//-------------END OF NEW CODE!---------------------------//
   } 
class ObjectSortApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;             
      ArrayInOb arr;                 
      arr = new ArrayInOb(maxSize);  

      arr.insert("Evans", "Patty", 24);
      arr.insert("Smith", "Doc", 59);
      arr.insert("Smith", "Lorraine", 37);
      arr.insert("Smith", "Paul", 37);
      arr.insert("Yee", "Tom", 43);
      arr.insert("Hashimoto", "Sato", 21);
      arr.insert("Stimson", "Henry", 29);
      arr.insert("Velasquez", "Jose", 72);
      arr.insert("Vang", "Minh", 22);
      arr.insert("Creswell", "Lucinda", 18);

      System.out.println("Before sorting:");
      arr.display();                 

      arr.bubbleSort(); //The bubble sort in action!          

      System.out.println("After sorting:");
      arr.display();                 
      }  
   }  

