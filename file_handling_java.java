//import java.util.*;
import java.io.File;
import java.io.IOException;
public class fileclass{
public static void main(String []args) throws IOException
{
 File f1=new File("C:/Users/91734/Desktop/java/name.txt");
 System.out.println("is exist" +f1.exists());
 f1.createNewFile();
 System.out.println("is exist" +f1.exists());
 System.out.println("name "+f1.getName());
 System.out.println("size"+f1.length());
 System.out.println("can file write"+f1.canWrite());
}
}
