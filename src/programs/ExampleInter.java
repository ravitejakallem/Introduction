package programs;

public class ExampleInter {

	public static void main(String[] args) {
		String s1="test@123test";
            
	s1=s1.replaceAll("[^a-zA-Z]"," "); //^-CHAR Operator otherthan these will be replaced   by whitespace.
	System.out.println("After removing special character:"+ s1.trim());
	}

}
