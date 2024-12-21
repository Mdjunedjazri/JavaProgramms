package java_Programms;

import java.util.Scanner;

public class reverseString {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=sc.next();
	String rev="";
	/*
	int len=str.length();
	
	for (int i=len-1; i>=0; i--)
	{
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);
	
	// using String buffer
	
	StringBuffer sb=new StringBuffer(str);
	StringBuffer value=sb.reverse();
	
			
	
System.out.println(value);				}

*/
	
	//using array
	
	char a []= str.toCharArray();
	int len=a.length;
	
	for (int i=len-1; i>=0; i--)
	{
		rev=rev+a[i];
	}
	
	System.out.println(rev);
	
	

}

}
