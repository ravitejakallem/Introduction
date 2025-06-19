package CoreJava;

public class PrintSmallestNuminMultiDimenArray {

	/* 9 8 6
	 * 6 5 4
	 * 5 0 2
	 */
	
	//Second question print highest number in the column of smallest number found
	//o/p should be 8
	//algorithm: 1) Find the column index which is J
	//2) find the highest number in the identified column
	public static void main(String[] args) {
		int a[][]= {{9,8,6},{6,5,4},{5,0,2}};
		 int min=a[0][0];
		 int columnval=0;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a.length;j++) {
				 if(a[i][j]<min)
				 {
					 min=a[i][j];
					 columnval=j;
					 System.out.println(columnval);
				 }
			 }
		 }
         int k=0;
         int max=a[0][columnval];
         while(k<3)
         {
        	 if(a[k][columnval]>max)
        	 {
        		 max=a[k][columnval];
        	 }
        	 k++;
         }
		 System.out.println(max);
System.out.println(min);
	}

}
