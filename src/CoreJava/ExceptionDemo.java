package CoreJava;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=3;
		int b=0;
		
		
		try {
			//int c=a/b;
			//System.out.println(c);
			int arr[]=new int[3];
			System.out.println(arr[7]);
			
		}
		
		catch(ArithmeticException e)
		{
		System.out.println(" I caught the arithmethicException/Error");	
		}
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("I caught IndexoutofBoundsError");
		}
		catch(Exception es) {
			System.out.println("I caught exception");
		}

		finally {
			System.out.println("Delete cookies and exit browser");
		}
	}

}
