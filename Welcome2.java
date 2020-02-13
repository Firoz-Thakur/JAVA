import java.util.*;
class Stude
{
  String name;
  int roll;
  int submarks[];
 public void setMarks()
{ 
   Scanner sc=new Scanner(System.in);
   //sc.nextLine();
   name=sc.nextLine();
   roll=sc.nextInt();
   submarks=new int[4];
   for(int i=0;i<4;i++)
      {
         submarks[i]=sc.nextInt();
      }
}
 public void showMarks()
{
    System.out.println("name=" + name);
    System.out.println("rollno" + roll);
    for(int i=0;i<4;i++)
       System.out.println("marks of "+(i+1)+ "subject is"+submarks[i]);
}
}
public class Welcome2
{
  public static void main(String []args)
{
    Stude obj[]=new Stude[3];
    for(int i=0;i<3;i++)
      {  obj[i]=new Stude();
         obj[i].setMarks();
      }
     
 for(int i=0;i<3;i++)
      {
         obj[i].showMarks();
      }
     
}
}