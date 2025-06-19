package CoreJava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] a=new int[2][3];
		a[0][0]=1;
		a[0][1]=6;
		a[0][2]=9;
		a[1][0]=12;
        a[1][1]=14;
        a[1][2]=16;
        
        //System.out.println(a[1][1]);
        
        int b[][]= {{12,16,14},{5,1,6},{9,9,12}};
        //System.out.println(b[1][2]);
        for(int i=0;i<b.length;i++)
        {
        	for(int j=0;j<b.length;j++)
        	{
        		System.out.println(b[i][j]);	
        		System.out.println("\t");
        	}
        	System.out.println("");
        }
	}

}
