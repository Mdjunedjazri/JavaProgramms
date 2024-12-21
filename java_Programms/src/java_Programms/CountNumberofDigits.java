package java_Programms;

import java.util.Scanner;

public class CountNumberofDigits {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Number");
		int count=0;
		int num=sc.nextInt();
		
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("The Number digits presentare "+count);
	}

}
