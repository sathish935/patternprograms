package LOGpractice;

import java.util.Scanner;

public class lettercheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int uc=0,lc=0,dc=0,spc=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') 
				uc++;
			
			else if(ch>='a' && ch<='z')
				lc++;
			
			else if(ch>='0' && ch<='9')
				dc++;
				else
					spc++;
		}
		System.out.println("number of cap "+uc);
		System.out.println("nuber oc low "+lc);
		System.out.println("nuber oc num "+dc);
		System.out.println("nuber oc special "+spc);
	}
}
	
