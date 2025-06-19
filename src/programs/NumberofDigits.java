package programs;

public class NumberofDigits {

	public static void main(String[] args) {
		int number=168362;
		int count=0;
		while(number>0) {
			number=number/10;
			count++;
		}
System.out.println("Number of digits are:"+count);
	}

}
