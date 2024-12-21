package java_Programms;

import java.util.Scanner;

public class LargestOfNumbers {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the frist number");
		
		int a=sc.nextInt();
		
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		
	/*	
		if(a>b && a>c) {
			System.out.println("a is the largest number");
		}else if (b>a && b>c) {
			System.out.println("b is largest number");
			
		}else {
			System.out.println("c is the largest number");
		}
	}
	*/
		

	//using ternary operator
	
	int largest= a>b?a:b;
	largest=largest>c?largest:c;
	System.out.println("The Largest Number is: "+largest);
	
	
	
}
}
