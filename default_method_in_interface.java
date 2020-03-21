interface i1
{
  void show();
  default void f1()
{
 System.out.println("this is red");
}
}
class b implements i1
{
  public void show()
  {
   System.out.println("fuck of beb");
  }
}
public class fuck22
{
  public static void main(String []args)
 {
   b obj=new b();
   obj.f1();
   obj.show();
}
}
