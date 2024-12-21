package practice;

import java.util.Scanner;

public class Reversegivennumber {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int rev=0;
		
		/*
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("The revers number is: "+rev);
		
		*/
		
		/*
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer revs=sb.reverse();
		System.out.println(revs);
		*/
		
		StringBuilder sb = new StringBuilder(num);
		sb.append(num);
		StringBuilder revv=sb.reverse();
		System.out.println(revv);
		
	}

}
