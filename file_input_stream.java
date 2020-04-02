import java.io.*;
public class fileinput{
 public static void main(String []args) throws IOException
{ 
  FileInputStream fin=new FileInputStream("C:/Users/91734/Desktop/java/myfuck.txt");
  int i;
  do
 {
  i=fin.read();
  if(i!=-1)
   System.out.print((char)i);
  }while(i!=-1);
 fin.close();
}
}
