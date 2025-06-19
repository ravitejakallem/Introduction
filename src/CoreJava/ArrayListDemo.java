package CoreJava;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> ae=new ArrayList<String>();
		ae.add("Ravikallem");
		ae.add("5");
		ae.add("Java foundation");
		ae.add(1, "Expert");
		System.out.println(ae);
		System.out.println(ae.get(0));;
		//ae.remove(2);
		//ae.remove("Java foundation");
		System.out.println(ae.contains("Java foundation"));
		System.out.println(ae);
		ae.indexOf("Ravikallem");
		System.out.println(ae.isEmpty());
		System.out.println(ae.size());

	}

}
