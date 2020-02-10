enum Season
{
	 SUMMER(10),WINTER(4),AUTUMN(3),SPRING;
	 int value;   //indvidual copy for every variable
	              
	 Season(int a)
	 {
		  value=a;
	 }
	 Season()
	 {
		 value=100;
	 }
	 
}
public class enum12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Season s[]=Season.values();
	  System.out.println(s[0]);
	  System.out.println(s[3]);
	  System.out.println(Season.SUMMER);
	  System.out.println(Season.SUMMER.value);
	  System.out.println(Season.SPRING.value);
	  
	}
}
