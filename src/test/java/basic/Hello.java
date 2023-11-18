package basic;

public class Hello {

	public static void main(String[] args) {
		
	String st="It is my India";
	
	String[] a=st.split(" ");
	
	String rev="";
	
	for(int i=a.length-1;i>=0;i--) {
		
		rev += a[i] + " ";
	}
		System.out.println(rev);
		
		
	}
}
