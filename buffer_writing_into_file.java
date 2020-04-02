import java.io.*;
public class buffio{
 public static void main(String []args) throws IOException
{
 FileWriter fd=new FileWriter("C:/Users/91734/Desktop/java/fuck3.txt",true);
 BufferedWriter bf=new BufferedWriter(fd);
 bf.write("computer");
 bf.close();
 }
}
