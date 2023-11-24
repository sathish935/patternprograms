package LOGpractice;

public class numberpattern {
	
	public static void main(String args[]) {
//		int n = 5;
//
//		for(int i=n;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		for(int i=2;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//		
//	}
//			System.out.println();
//		}}

/**
 * --output
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */
//		int n = 5;
//
//		int counter = 1;
//		//Loop to iterate over each row
//		for(int i=1;i<=n;i++){
//			//Loop to iterate over each column
//			for(int j=1;j<=i;j++){
//				System.out.print(counter+ " ");
//				counter++; 
//			}
//			System.out.println();
//		}
		
		/**
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
		 * 
		 * 
		 */ 
//			int n = 5;
//
//			//Loop to iterate over each row
//			for(int i=1;i<=n;i++){
//				//Loop to iterate over each column
//				int counter = i;
//				for(int j=1;j<=i;j++){
//					System.out.print(counter+ " ");
//					counter = counter+n-j; 
//				}
//				System.out.println();
//			}
	/**
 1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
	 * 
	 */
	
		int n = 5;

		//Printing Upper Half of n rows
		//Loop to iterate over each row
		for(int i=1;i<=n;i++){
			// i-1 spaces in each row
			for(int j=1;j<i;j++){
				System.out.print(" "); 
			}
			
			//Loop to iterate over each column
			for(int j=i;j<=n;j++){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}

		//Printing Lower Half of n-1 rows
		//Loop to iterate over each row in reverse order
		for(int i=n-1;i>=1;i--){
			// i-1 spaces in each row
			for(int j=1;j<i;j++){
				System.out.print(" "); 
			}
			
			//Loop to iterate over each column
			for(int j=i;j<=n;j++){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}  
	
	}	
}