import java.io.*;
class readbuf3
 {
 public static void main(String ar[]) throws IOException
 {
 // String  s1;
  BufferedReader bf=new BufferedReader(new FileReader("C:/Users/91734/Desktop/java/fuck3.txt"));
  char []s=new char[20]; 
  bf.read(s,4,15);
  System.out.println(s);
  bf.close();
}
}
