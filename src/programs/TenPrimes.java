package programs;

public class TenPrimes {

	public static void main(String[] args) {
		int j,count;
		for(int i=1;i<30;i++) {
			count=0;
			for(j=2;j<i/2;i++) {
				
		
			if(i%j==0) {
				count++;
				break;
		
			}
			}
			
			if((count==0)&&(number!=1))
			{
				System.out.println("Prime number is:"+number);
			}
		}

	}

}
