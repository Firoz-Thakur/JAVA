import java.util.*;
public class exception43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try{
		  String[] obj=new String[5]   ;
		// System.out.println(args[8]);
		  Scanner sc=new Scanner(System.in);
		  for(int i=0;i<5;i++)
		  {
			  obj[i]=sc.nextLine();
		  }
		  String a=obj[8];
		 }
		 catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("baba ArrayIndexOutOfBoundsException"+e.getMessage());
		 }
		 }
		 
	}


