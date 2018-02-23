//Assignment 1
/* In this program, a production worker will be entered into a database using attributes, sll of which will be
included in two classes, Employee and ProductionWorker, of which ProductionWorker will inhetir Employee. */

public class Employee
{
   String name;
   int empNum;
   int hireDate;
   
   public Employee()
   {
      String name;
      int empNum;
      int hireDate;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setEmpNum(int empNum)
   {
      this.empNum = empNum;
   }
   
   public int getEmpNum()
   {
      return empNum;
   }
   
   public void setHireDate(int hireDate)
   {
      this.hireDate = hireDate;
   }
   
   public int getHireDate()
   {
      return hireDate;
   }
}
   