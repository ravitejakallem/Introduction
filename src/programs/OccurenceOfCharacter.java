package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		
	String s1="JAVA PROGRAMMING JAVA OOPS JAVA";
	String s=s1.replaceAll(" ", "");
	HashMap<Character , Integer> map=new HashMap<>();
	char[] ch = s.toCharArray();
	System.out.println(Arrays.toString(ch));
	for(char c : ch) {
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}
		else {
			map.put(c, 1);
	}}
	
			System.out.println(map);
	for(Entry<Character, Integer> m1:map.entrySet())
			{
		System.out.println("Character is :"+ m1.getKey() +"    number of character is : "+ m1.getValue());
			}

	}

}
