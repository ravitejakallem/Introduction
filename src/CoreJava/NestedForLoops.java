package CoreJava;

public class NestedForLoops {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) //0;o<4 / 1<4 /2<4 / 3<4
		{
			System.out.println("Outer loop started");
			for(int j=0;j<4;j++)  //0;0<4;1  / 1;1<4;2 / 2;2<4;3 / 3;3<4;4
			{
				System.out.println("Inner Loop");
			}
			System.out.println("Outer loop Finished");
		}

	}

}
