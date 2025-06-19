
public class JavaBrush3 {

	public static void main(String[] args) {
		// String is an object and sequence of characters 
		String s1="Ravi teja kallem"; // String literal: When in string s1 and s2 same character is present then string s2 will use string s1 instead of allocating memory to it 
		String s2="Ravi teja kallem";
		String s5="Hello";

		String s=new String("Welcome");
		String s3=new String("Welcome");//Here memory allocation will be created seperately.
		
		String s6="Ravi teja kallem";
		String[] splitter=s6.split(" ");
		System.out.println( splitter[0]);
		System.out.println( splitter[1]);
		System.out.println( splitter[2]);
		//program to create string in same order.
		for(int i=0;i<s6.length();i++)
		{
			System.out.println(s6.charAt(i));
		}
		System.out.println("Differentiating");
		//Program to create a string in Reverse order.
		for(int i=s6.length()-1;i>=0;i--)
		{
			System.out.println(s6.charAt(i));
		}
	}

}
