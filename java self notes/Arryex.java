import java.util.*;
class Arryex
{
   public static void main(String []args)
  {
    int ar[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter five numbers");
    for(int i=0;i<5;i++)
     {
	ar[i]=sc.nextInt();
	}
    for(int i=0;i<5;i++)
    {
       System.out.println(ar[i]);
    }
}
}