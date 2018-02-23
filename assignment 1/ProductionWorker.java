// Assignment 1
/* In this program, a production worker will be entered into a database using attributes, sll of which will be
included in two classes, Employee and ProductionWorker, of which ProductionWorker will inhetir Employee. */

public class ProductionWorker extends Employee
{
   private int shift;
   private double payRate;
   
   public ProductionWorker()
   {
      int shift;
      double payRate;
   }
   
   public ProductionWorker(String name, int empNum, int hireDate, int shift, double payRate)
   {
      this.name = name;
      this.empNum = empNum;
      this.hireDate = hireDate;
      this.shift = shift;
      this.payRate = payRate;
   }
   
   public void setShift(int shift)
   {
      this.shift = shift;
   }
   
   public int getShift()
   {
      return shift;
   }
   
   public void setPayRate(double payRate)
   {
      this.payRate = payRate;
   }
   
   public double getPayRate()
   {
      return payRate;
   }
}