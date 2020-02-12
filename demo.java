import java.util.*;
class Circle()
{
	 double radius;
	 double area()
	 {
		 return (3.14 *radius * radius);
	 }
    double perimeter()
    {
        return (2 *3.14 *radius);
    } 
}
public class demo {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in); 
	 int arr[]=new Circle[4];
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i]=new Circle();
    	 System.out.println("enter the radius of circle ");
    	 arr[i].radius=sc.nextDouble();
     }
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println("area of circle"+arr[i].area());
    	 System.out.println("perimeter of circle"+arr[i].perimeter());
    	 System.out.println();
     }
	}
}
