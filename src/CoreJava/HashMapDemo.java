package CoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	
	//Hashmap is non-synchronized and not thread safe -->simulataneously many program can use.
	//Hashmap allows one null key and number of null values
	//Hashtable is synchronized and thread safe -->meaning once program is completed then only other is called.
	//Hashtable doesnot allow null key and null values.

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(0, "Client Groups"); // instead of add we use Put here
		hs.put(1, "JAVA");
		hs.put(2, "Selenium");
		hs.put(3, "4");
		hs.put(4, "Needed peace");
		
		//Inorder to store data in Set wise object create we will call entry set. 
		Set s=hs.entrySet();
		
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
		        // System.out.println(it.next());    // inorder to differenitate further we can use map.Entry class for diving keys and values
		         Map.Entry mp=(Map.Entry)it.next();
		        System.out.println(mp.getKey()); 
		        System.out.println(mp.getValue());
		         
		}

	}

}
