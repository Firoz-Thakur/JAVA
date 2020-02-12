import java.util.*;
enum Season
{
 SUMMER,SPRING,WINTER,AUTOMN;
}
class demo
{
 public static void main(String[] args)
{ 
 Scanner sc=new Scanner(System.in);
 String a=sc.nextLine();
 Season b= Season.valueOf(a);
 Season s[]=Season.values();
 for(int i=0;i<4;i++)
 {    if(s[i].equals(b))
       System.out.println("its exit");
}
}
}