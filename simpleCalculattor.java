import java.util.*;
class Calculator
{
   public int add(int a,int b)
     {
       return a+b;
      }
   public int  mul(int a,int b)
      {      return a*b;}
   public int sub(int a,int b)
       {
           if(a>b)
              return a-b;
	   else 
	     return b-a;
 	}
   public int div(int a,int b)
       {return a/b;}
}

public class Let
{
   public static void main(String []args)
   {
     Scanner sc=new Scanner(System.in);
   //  System.out.println("enter two interger");
     //int a=sc.nextInt();
     //int b=sc.nextInt();
     System.out.println("1.addition");
     System.out.println("2.substraction");
     System.out.println("3.multiplication");
     System.out.println("4.divison");
     System.out.println("5.divison");
     Calculator obj1=new Calculator();
  while(true)
{       System.out.println("please enter the number");
       int a=sc.nextInt();
        int b=sc.nextInt();
         
     System.out.println("please enter you choice");
     int selection=sc.nextInt();
     switch(selection)
     { 
       case 1:    
             System.out.println(obj1.add(a,b));
               break;
       case 3:    
             System.out.println(obj1.mul(a,b));
                 break;
       case 2:    
             System.out.println(obj1.sub(a,b));
	       break;
        case 4:    
             System.out.println(obj1.div(a,b));
               break;
        case 5: System.exit(1);
                 
        default :
              System.out.println("please enter the valid number given in the list again");
             
   }
} 
}
}
  












