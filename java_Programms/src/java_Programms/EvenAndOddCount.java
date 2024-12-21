package java_Programms;

import java.util.Scanner;

public class EvenAndOddCount {
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int EvenCount=0;
		int OddCount=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				EvenCount++;
				
			}else
			{
				OddCount++;
				
			}
			num=num/10;
		}
		
		System.out.println("Even count="+EvenCount+" "+"Odd Count:"+ OddCount);
		
	}

}
