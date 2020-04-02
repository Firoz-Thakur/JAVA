import java.io.*;
public class file2
{
 public static void main(String []arg) throws IOException
{
  FileOutputStream fout=new FileOutputStream("C:/Users/91734/Desktop/java/myfuck.txt",true);
 String s="tat";
 char ch[]=s.toCharArray();
 for(int i=0;i<s.length();i++)
{
 fout.write(ch[i]);
}
 fout.close();
}
}
