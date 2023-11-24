package LOGpractice;

public class primefactor {

	public static void main(String[] args) {
		
		int num=99;
		
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.println("the product of "+i);
			num=num/i;
			}
		}
		if(num>2) {
			System.out.println("the print num :"+num);
		}

	}

}
