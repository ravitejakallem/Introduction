import java.util.ArrayList;

public class JavaBrush2 {

	
	public static void main(String[] args) {
		
		 int[] arr2= {1,2,3,6,3,100,200,500};
	        
	        for(int i=0;i<arr2.length;i++)
	        {
	        	if(arr2[i]%2==0) {
	        	
	        		System.out.println(arr2[i]);
	        		break; // if at all if you want only one multiple of 2 then break statement will help to come out of for loop.
	        	}
	        	
	        	else
	        	{
	        		System.out.println(arr2[i] +"is not a multiple of 2");
	        	}
	        }
	        
	        ArrayList<String> ar=new ArrayList<String>();
	        ar.add("Ravikallem");
	        ar.add("GY");
	        ar.add("Dad Mom");
	        System.out.println(ar.get(1)); // for array list we retrieve data by using get method.
	        System.out.println (ar.getFirst());
	        System.out.println (ar.getLast());
	        System.out.println ("------");
	        for(int i=0;i<ar.size();i++) // For arraylist we use .size method to get total length
	        {
	        	System.out.println(ar.get(i));
	        }
	        System.out.println ("******");
	        for( String val:ar) {
	        	System.out.println(val);
	        }
	        System.out.println(ar.contains("GY"));
	        System.out.println(ar.contains("Y"));

	}

}
