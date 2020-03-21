interface print
{
 void print();
}
interface show
{
 void show();
}
class a implements print,show
{
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
  obj.print();
  obj.show();
}
}
