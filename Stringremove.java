package LOGpractice;

public class Stringremove {
	
	public static String remove(String str) {
		
		
		str=str.substring(1,str.length()-1);
		
		return str;	
		
	}
	public static void main(String[] args) {
		String str="sathish";
		System.out.println("name of :"+remove(str));
	}

}
