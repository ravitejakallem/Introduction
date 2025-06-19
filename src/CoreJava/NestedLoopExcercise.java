package CoreJava;

public class NestedLoopExcercise {

	public static void main(String[] args) {
		int a=1;
		for(int i=0;i<4;i++)
		{
			
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(a );
				System.out.print("\t");
				a++;
				
			}
			System.out.println("");
		}

	}

}
