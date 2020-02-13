import java.util.*;
class Circle{
private int radius;
public void display(int r)
{ 
  radius=r;
  System.out.println(3.14*radius* radius);
}
}
public class Welcome{
  public static void main(String []args)
   {  

      System.out.println("who many circles area you want to find");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      Circle obj=new Circle();
      for(int i=0;i<n;i++)
      {
          System.out.println("enter the details of "+ (i+1) +" circle");
          int r=sc.nextInt();
          obj.display(r);                    
      }
}
}