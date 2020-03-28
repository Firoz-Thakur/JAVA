import java.util.*;
public class exception43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 
		 try{
			 String s=sc.nextLine();
			 int a=Integer.parseInt(s);
			 System.out.println("squar of number is "+a*a);
		 }
		 catch(NumberFormatException e){
			 System.out.println("baba string is not enter in number "+e.getMessage());
		 }
		 }
		 
	}


