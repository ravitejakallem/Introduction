import java.util.Arrays;
import java.util.List;

public class JavaBrush1 {

	public static void main(String[] args) {
		int num=5;
		String sr="Ravi";
		char ch= 'R';
		double d=5.66;
		System.out.println("the value present in the integer variable is :" +num);
        System.out.println(sr);
        
        //Arrays - collection of homogeneous data
        int[] arr= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=8;
        arr[4]=20;
        
        for(int i=0;i<arr.length;i++) // right to left operation
        {
        	System.out.println(arr[i]);
        }
        int[] arr2= {1,2,3,6,3,100,200,500};
        
        for(int i=0;i<arr2.length;i++)
        {
        	System.out.println(arr2[i]);
        }
  String[] name=new String[4];
 
  int [] example= {1,2,3,4,5,6};
  System.out.println(Arrays.toString(example)); // if at all if we print number without using for loop or while loop

  
  name[0]="KALLEM";
  name[1]="Anitha";
  name[2]="Srinivas";
  name[3]="Ullas Vihari";
  
  System.out.println(Arrays.toString(name));
  
 System.out.println("---------");
  
  
  for(int i=0;i<name.length;i++)
  {
	  System.out.println(name[i]);
  }
  
  String[] name1= {"Ravi","Gayathri"};
  for(int i=0;i<name1.length;i++)
  {
	  System.out.println(name1[i]);
  }
  
  for(String s:name1)
  {
	  System.out.println(s);
  }
             List<String> arrr1=Arrays.asList(name1);
             System.out.println(arrr1.contains("Ravi"));
  
	}

	
	
	
}
