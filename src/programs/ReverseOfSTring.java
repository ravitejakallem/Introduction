package programs;

public class ReverseOfSTring {

	public static String revOfStr(String s) {
		
		if (s.isEmpty() || s.length() == 1) {
            return s;
        } else {
            // Recursive case: concatenate the last character with the reversed substring
            return s.charAt(s.length() - 1) + revOfStr(s.substring(0, s.length() - 1));
        }
	}
	
	
	public static void main(String[] args) {
		String s1="Shubham";
		System.out.println(revOfStr(s1));
		
	}

}
