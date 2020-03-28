import java.util.*;
public class exception43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 try{
		 
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=a/b;
		 System.out.println(args[8]);
		 }
		 catch(ArithmeticException e){
			 System.out.println("error"+e.getMessage());
		 }
		 catch(InputMismatchException e)
		 {
			 System.out.println(" input error"+e.getMessage());
		 }
		 catch(IndexOutOfBoundsException e)
		 {
			 System.out.println(" index fuck error"+e.getMessage());
		 }
	}

}
