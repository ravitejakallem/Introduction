package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		 String str=sc.next();
		 String Rev_Str=str;
		 for(int i=str.length()-1;i>0;i--) {
			 System.out.println(str.charAt(i));
		 }
		 if(Rev_Str.equals(str)) {
			 System.out.println("palindrome:"+Rev_Str);
		 }

	}

}
