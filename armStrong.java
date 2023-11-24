package LOGpractice;

public class armStrong {
	public static void main(String[] args) {
		  int n = 153;
	        int temp = n;
	        int sum = 0;
	
	        while (n > 0) {
	 
	            int rem = n % 10;
	            sum= sum + (rem* rem * rem);
	            n = n / 10;
	        }
	        if (temp == sum) {
	            System.out.println("Yes. It is Armstrong No."+sum);
	        }
	        else {
	            System.out.println(
	                "No. It is not an Armstrong No.");
	        }
	}

}
