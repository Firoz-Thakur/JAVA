class Add
{
  int a,b;
 
  void setab(int a,int b)
  {
    a=a;
    b=b;
 }
 void display(Add obj2)
{
   System.out.println(a+obj2.b);
   System.out.println(b+obje.b) 
}
}
class demo4
{
public static void main(String []arg)
{
   Add obj1=new Add();
   Add obj2=new Add();
   obj1.setab(1,3);
   obj2.setab(5,8);
   obj1.display();
}
}