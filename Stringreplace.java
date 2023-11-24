package LOGpractice;

public class Stringreplace {
	public static void main(String[] args) {
		String str="i am tathish";
		
		int index=2;
		char ch='S';
		
		System.out.println("orignal string =" + str);
		
		
		str=str.substring(0,index)+ch+str.substring(index+1);
		
		System.out.println("modifyed str =" + str);
	}

}
