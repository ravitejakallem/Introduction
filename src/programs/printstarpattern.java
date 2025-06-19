package programs;

import java.util.Scanner;

public class printstarpattern {

	public static void main(String[] args) {
		/*int k=0;
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<=i;j++) {
				k++;
				System.out.println(k);
			}
			System.out.println();
		}

//		int a=0;
//		for(int b=1;b<4;b++) {
//			for(int c=1;c<4-b;b++) {
//				
//				System.out.println(a);
//				a++;
//			}
//			System.out.println();
//		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows=sc.nextInt();
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.println("* ");
			}
			System.out.println();
		}
		
	}

}
