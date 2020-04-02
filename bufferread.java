import java.io.*;
class readbuf
 {
 public static void main(String ar[]) throws IOException
 {
  int ch;
  BufferedReader bf=new BufferedReader(new FileReader("C:/Users/91734/Desktop/java/fuck3.txt"));
  while((ch=bf.read())!=-1)
  {
  System.out.println((char)ch);
  }
 bf.close();
}
}
