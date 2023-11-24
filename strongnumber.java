package LOGpractice;

public class strongnumber {

	public static void main(String[] args) {
		 int num = 145;

	     if (Strong (num))
	         System.out.println (num + " is Strong Number");
	     else
	         System.out.println (num + " is not a Strong Number");
	   }

	   // function to calculate factorial
	   static int factorial (int n)
	   {
	     int fact = 1;

	     for (int i = 1; i <= n; i++)
	       fact = fact * i;
 
	     return fact;
	   }

	   static boolean Strong (int num)
	   {

	     int rem, sum = 0;
	     int temp = num;
	     boolean st = false;

	     // calculate 1! + 4! + 5!
	     while (temp != 0)
	       {
	     	rem = temp % 10;

	     	sum = sum + factorial (rem);
	 	    temp /= 10;
	       }

	     // returns 1 if both equal else 0
	     if (sum == num)
	       st = true;
	     else
	       st = false;

	     return st;


		
		// TODO Auto-generated method stub

	}

}
