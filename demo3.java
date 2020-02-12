
class Circle
{ 
	 private double radius;
	 
	 void setRad(double r)
	 {
		 radius=r;
		 
	 }
	 double getRad()
	 {
		return radius;
	 }
	 void display(Circle obj)
	 {     
               System.out.println(radius+obj.radius); 
         } 
}
public class demo3
 {

	public static void main(String[] args)
 {
	// TODO Auto-generated method stub
	   Circle ar=new Circle();
	   Circle ar1=new Circle();
	   ar.setRad(5.3);
	   ar1.setRad(5.4);
	   ar.display(ar1);
      
   
}

}
