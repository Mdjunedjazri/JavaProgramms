package practice;

public class StringMethods {
	
	public static void main(String[] args) {
		
		
		String a="mohammed juned jazri";
		String b="  I am";
		String c="";
		String e="MOHAMMED";
		
		
		
		System.out.println("Uppser case "+a.toUpperCase());
		System.out.println("Trinm "+b.trim());
		System.out.println("Lenth "+a.length());
		System.out.println(a.indexOf("a"));
		System.err.println("concat "+a.concat(b));
		System.out.println("substing "+a.substring(5));
		System.err.println("lower case "+e.toLowerCase());
		
		String [] x=a.split(" ");
		for (String str:x)
		{
			System.out.println("Splitted String: "+str.toUpperCase());
		}
		
		
		System.out.println("replace "+b.replace('I', ' '));
		
		
		System.out.println("Substring with begining and ending: "+e.substring(1, 6));
		
		System.out.println(c.isEmpty());
		System.out.println(c.isBlank());
		String Ssttr="";
		
		char [] arr=a.toCharArray();
		for (char ar:arr)
		{
			System.out.print(ar);
			System.out.println();
			
		}
		
		System.out.println(arr.length);
		for (int j=arr.length-1; j>=0; j--)
		{
			Ssttr=Ssttr+arr[j];
			
		}
		System.out.println(Ssttr);
		
	
	}

}
