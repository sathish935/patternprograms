 package LOGpractice;

import java.util.Scanner;

public class checkprime {
	
	public static void main(String[] args) {
	   int n=11 ;

	    boolean isPrime = true;
	    for (int i = 2; i < n; i++) {
	      if (n % i == 0) {
	        isPrime = false;
	        break;
	      }
	    }
	    if (isPrime) {
	      System.out.println(n + " is a prime number.");
	    } else {
	      System.out.println(n + " is not a prime number.");
	    }
	  }

}
