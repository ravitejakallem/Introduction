package CoreJava;

public class PyramidProgram {

	public static void main(String[] args) {
		int z=1;
		for(int i=1;i<=4;i++)     //1-<1, 2
		{
			for(int j=1;j<=i;j++)  // inner loop will start from beginning j=1,1<=2; and 2<=2 and 1<=3,2<=3,3<=3
			{
				System.out.print(z);
				System.out.print("\t");
				z++;
			}
			System.out.println("");
		}

	}

}
