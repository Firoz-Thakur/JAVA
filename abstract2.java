abstract class shape
{
	abstract int area();
	
}
class sqr extends shape{
	 private int a;
	 sqr(int a)
	 {
		 this.a=a;
	 }
	 int area()
	 {
		 return a*a; 
	 }
}
public class test1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sqr s= new sqr(2);
       System.out.println(s.area());
	}
}
