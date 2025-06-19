package programs;

public class zohoInterview {

	public static void main(String[] args) {
		//Input - a2b3c1
		//Output - aabbbc
		
		String str="a2b3c1";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else {
				
				int r=Character.getNumericValue(str.charAt(i));
				for(int j=0;j<r;j++)
				{
					System.out.print(str.charAt(i-1));
				}
			}
	}

	}
}
