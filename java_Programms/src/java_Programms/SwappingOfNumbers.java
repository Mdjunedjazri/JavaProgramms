package java_Programms;

public class SwappingOfNumbers {
	
	public static void main(String[] args) {
		
		// logic 1 using 3rd variable
		int a=10;
		int b=5;
		int c;
		
		System.out.println("before swap a:"+a);
		System.out.println("before swap b:"+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("after swap a:"+a);
		System.out.println("after swap b:"+b);
		
		
		// without third variable
		
		a=a+b;  //15
		b=a-b;  //5
		System.out.println("Value of a:"+a);
		System.out.println("Value of b :"+b);
		
		
		// using multiplication and division
		
		a=a*b; //50
		b=a/b; //10
		a=a/b; //5
		
		System.out.println("Value :"+a +" "+b);
		
	}
	

}
