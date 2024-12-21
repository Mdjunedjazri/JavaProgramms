package java_Programms;

import java.util.Scanner;

public class PalindromString {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
				String str=sc.next();
				String rev="";
				String org_str=str;
				int len=str.length();
				for (int i=len-1; i>=0; i--)
				{
					rev=rev+str.charAt(i);
				}
				
			if (rev.equals(org_str=str))
			{
				System.out.println(org_str=str+" String is Pallindrom");
			}else {
				System.out.println(org_str=str+" Not a Pallindrom String" );
			}
	}
	
}
