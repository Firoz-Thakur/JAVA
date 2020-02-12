import java.util.*;

class conversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo obj=new Demo();
       obj.presentMenu();
	}
}
	
class Demo{
	
	 public static void presentMenu()
	 {
        while(true)
{       
	  System.out.println("1.Create bank account");
	  System.out.println("2.Add money");
	  System.out.println("3.withdraw money");
	  System.out.println("4.exit");  
	  Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();


	  switch(x)
	  {
	  case 1: 
		    System.out.println("account created");
                      break;
	  case 2: 
		    System.out.println("add money");
	              break;
	  case 3: 
		    System.out.println("wihtdrwa money");
	                break;
	  case 4: 
		    System.exit(0);
	  }
}	 
}
}


