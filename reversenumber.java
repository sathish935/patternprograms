package LOGpractice;

public class reversenumber {
	public static void main(String[] args) {
		int number=9876,reverse=0;

		while(number!=0)
		{

			int remainder=number%10;			
			reverse=reverse*10+remainder;

			number=number/10;		
		}
		System.out.println("print reverse number :"+reverse);
	}

}