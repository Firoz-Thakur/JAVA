class Student
{ 
  private int roll;
  private String name;
  public void setRoll(int r)
  {
 	roll=r;
  }
 public void setName(String s)
  {
      name=s;
  }
  public int showRoll()
  {
   return roll;}
 public String showName()
   {
   return name;}
   }
public class Example99{

   public static void main(String []args)
    {  
    Student obj=new Student();
    obj.setRoll(23);
    obj.setName("firoz");
    System.out.println("Roll no of the student is ="+obj.showRoll());
     System.out.println("Name no of the student is ="+obj.showName());
   }
}
     