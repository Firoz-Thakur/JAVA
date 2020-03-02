abstract class shape
{
	abstract double area();
	abstract double perimeter();
}
class Rectangle extends shape
{
    double radius,length;
	
    Rectangle(double length,double radius)
    {
    	 this.length=length;
    	 this.radius=radius;
    }
    
	double area()
	{
		return length*radius;
	}
	double perimeter()
	{
		return 2*(length*radius);
	}

}
public class abstract11{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle re=new Rectangle(12,4);
        System.out.println("area of the rectangle is="+re.area());
        System.out.println("area of the rectangle is="+re.perimeter());
	}
}
