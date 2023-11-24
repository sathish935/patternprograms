package LOGpractice;

import java.util.Scanner;

public class vowelcheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		int cc=0,vc=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z')
				if(ch=='A' || ch=='E' || ch=='O' || ch=='I' ||ch=='U')
					vc++;
				else
					cc++;
				
				else if(ch>='a' && ch<='z') {
					if(ch=='a' || ch=='e' || ch=='o' || ch=='i' ||ch=='u')
						vc++;
					else
						cc++;
			}	
		}
		System.out.println("the vowels of "+vc);
		System.out.println(":the constanct of "+cc);
	}

}
