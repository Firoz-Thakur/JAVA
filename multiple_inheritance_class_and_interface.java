abstract class shape
{
 abstract void fun();
}
interface print
{
 void print();
}
interface show extends print
{
 void show();
}
class a extends shape implements show
{
 void fun()
{
 System.out.println("yoh this is f1");
 }
 public void print()
{
 System.out.println("print");
}
public void show()
{
 System.out.println("show");
}
}
public class ptest
{
 public static void main(String []args)
{
  a obj=new a();
  obj.fun();
  obj.print();
  obj.show();
}
}
