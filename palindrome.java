package LOGpractice;

public class palindrome {

	public static void main(String[] args) {
		int num=455;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
		int	rem=num%10;
			
			sum=sum*10+rem;
			 num=num/10;
				
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
