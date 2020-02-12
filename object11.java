
public class object11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // String s1="helloe baba";
      // s1="hellow";
       char c[]={'a','z','c','b','c'};
       byte b[]={85,3,5,3,66};  //byte array
       String s1=new String(c);
       String s2=new String(c,1,2);
       String s5=new String(b,1,3);
       System.out.println(s5);
	}

}
//whenever the string method asks you an ending index in any of the argument
//then the ending index is never accessed.
