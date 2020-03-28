import java.util.*;
public class exception43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try{
		   fun();
		// System.out.println(args[8]);
		 }
		 catch(IllegalArgumentException e){
			 System.out.println("error"+e.getMessage());
		 }
	}
		 static void fun()
		 {
			 Scanner sc=new Scanner(System.in);
			 int a=sc.nextInt();
			 int b=sc.nextInt();
		
			 if(b==0)
			 {
				 throw new IllegalArgumentException("shai ni hn bor");
			 }
			 System.out.println(a/b);
		 }
		 
	}


