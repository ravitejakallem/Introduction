package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number:");
		int num=sc.nextInt();
		//int num=98412;
		 int rev=0;
		 while(num>0)
		 {
			 rev=rev*10+num%10;  //1234 rev=0*10+4=4; num=123;		                      // rev=4*10+3=43;                   //rev=43*10+2==432
			 num=num/10;
	 
		 }
		 System.out.println(rev);
		 
	}

}
