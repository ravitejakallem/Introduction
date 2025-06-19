package CoreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {
	
	//doesnot accept duplicate values
	//there is no gurantee elements are stored in sequential order

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("RAVI");
		hs.add("INDIA");
		hs.add("USA");
		hs.add("INDIA");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		//Iterator
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
