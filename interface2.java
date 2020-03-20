import java.util.*;
interface color
{
  void setcolor(String color);
  String getcolor();
}
class square implements color
{
 double side;
 String color;
 public void setcolor(String c)
 {
  color=c;
 }
 public String getcolor()
{
  return color; 
}
 void setside(double s)
 { 
   side=s;
 }
 double getside()
 {
  return side;
 }
 double getarea()
 {
  return side*side;
 }
}   

public class testf{
 public static void main(String []args)
{
  square obj=new square();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the color of the side");
  String s1= sc.nextLine();
  System.out.println("enter the value of the side");
  double sd= sc.nextInt();
  obj.setside(sd);
  obj.setcolor(s1);
  System.out.println("area of square is :"+obj.getarea());
  System.out.println("side of square is :"+obj.getside());
  System.out.println("color of square is :"+obj.getcolor());
}  
}
