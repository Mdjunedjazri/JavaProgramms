package java_Programms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Given Number");
		int num=sc.nextInt();
		
		int factorial=1;
		
		for (int i=1; i<=num; i++)
		{
			factorial=factorial*i;
		}

		System.out.println("Factorial of a given number is :"+factorial);

}
}