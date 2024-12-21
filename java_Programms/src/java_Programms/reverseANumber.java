package java_Programms;

import java.util.Scanner;

public class reverseANumber {

	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number:");
			int number=sc.nextInt();
			
			
			int revers=0;
		/*	
			while(number!=0)
			{
				revers=revers*10 + number%10;
				number=number/10;
			}
			
			System.out.println("reverse number"+revers);
			
			
			*/
			// using string buffer 
			
			/*
			StringBuffer sb = new StringBuffer(String.valueOf(number));
			StringBuffer rev=sb.reverse();
			
			System.out.println(rev);
			*/
			
			
			//using string builder
			StringBuilder sbl=new StringBuilder();
			sbl.append(number);
			sbl.reverse();
			System.out.println(sbl);
		}
		
	}
