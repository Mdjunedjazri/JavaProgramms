package practice;

import java.util.Scanner;

public class Pallindromnumber {
	
	public static void main(String[] args) {
		 
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number to check: ");
		int num=sc.nextInt();
		int rev=0;
		int orgnum=num;
		while (num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
			
			
		}
		
		if (orgnum==rev)
		{
			System.out.println(orgnum+" Number is Polindrom "+rev);
		}else
		{
			System.out.println(orgnum+" Number is not  Polindrom "+rev);
		}
		//System.out.println(rev);
		
		
	}

}
