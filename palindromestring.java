package LOGpractice;

import java.util.Scanner;

public class palindromestring {
	public static void main(String[] args) {
		String str;
		String rev="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		str=sc.nextLine();
		int length=str.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			if(str.equals(rev))
			{
				System.out.println(str +"pal");
			}else 
				System.out.println(str +"not pal");
		}

		}
	}



