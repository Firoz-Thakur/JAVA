interface shape
{
  double getarea();
}
class rectangle implements shape
{
  int len;
  int width;
  rectangle(int l,int w)
  {
     len=l;
     width=w;
  }
 public double getarea()
{
  return len*width;
}
}
class circle implements shape
{
  int radius;
  circle(int r)
  {
     radius=r;
  }
public double getarea()
{
  return 3.24*radius*radius;
}
}
class test011{
 public static void main(String []args) 
 {
   rectangle robj=new rectangle(2,4);
   circle cobj=new circle(4);
   calculate(robj);
   calculate(cobj);
  }
static void calculate(shape s)
{
  System.out.println("this is area"+s.getarea());
}
}






