package java_Programms;

import java.util.Scanner;

public class PallindromNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int Org_number=number;
		int rev=0;	
		
		while(number!=0)
		{
			rev=rev*10 + number%10;
			number=number/10;
		}
		
		if (Org_number==rev)
		{
			System.out.println(rev+" :Number is palindrom");
			
		}else {
			System.out.println(rev+" :Not a Palondrom");
		}
		
	}

}
