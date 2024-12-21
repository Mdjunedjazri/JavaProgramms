package practice;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.err.println("Enter the String: ");
		String str=sc.next();
		int len=str.length();
		String rev="";
		
	/*
		for (int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
System.out.println(rev);		
		*/
		
		
		StringBuffer sb=new StringBuffer(str);
		StringBuffer strr=sb.reverse();
		System.out.println(strr);
	}

}
