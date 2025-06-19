package programs;

public class WordPresentInString {

	public static void main(String[] args) {
		String txt="A brown fox ran away fast";
		String str="brow";
	if(txt.contains(str)) {
		System.out.println(str +  "Present");
	}
	else {
		System.out.println(  "Not Present");
	}

	}

}
