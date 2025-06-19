package programs;

import java.util.Random;

public class FibonacciSeriesFact {

	public static void main(String[] args) {
		int n=10,a=0,b=1,c;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(" "+c); 
			a=b;
			b=c;
		}
Random rand=new Random();
int num=5;
long factorial=1;
for(int j=1;j<=num;j++) {
	factorial=factorial*j;
}
	System.out.println("factorial of number"+factorial);
	}

}
