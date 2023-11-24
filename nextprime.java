package LOGpractice;

import java.util.Scanner;

public class nextprime {
	  public static boolean isPrime(int no) {
	        for (int i = 2; i < no; i++) {
	            if (no % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static int getNextPrime(int no) {
	        for (int i = no + 1; ; i++) {
	            if (isPrime(i)) {
	                return i;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);  
	        int no=13;
	        System.out.println("Next prime is: " + getNextPrime(no));
	    }

}
