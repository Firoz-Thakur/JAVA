import java.io.*;
class readbuf2
 {
 public static void main(String ar[]) throws IOException
 {
  String  s1;
  BufferedReader bf=new BufferedReader(new FileReader("C:/Users/91734/Desktop/java/fuck3.txt"));
  while((s1=bf.readLine())!=null)
  {
  System.out.println(s1);
  }
 bf.close();
}
}
