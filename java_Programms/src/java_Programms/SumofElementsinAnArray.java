package java_Programms;

public class SumofElementsinAnArray {
	
	public static void main(String[] args) {
		
		
		int [] arr= {1,2,3,10,5};
		int sum=0;
		/*
		for (int i=0; i<=arr.length-1; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		*/
		
		
		//enhance for loop
		
		for (int value:arr)
		{
			sum=sum+value;
		}
		
		System.out.println(sum);
	}
	

}
