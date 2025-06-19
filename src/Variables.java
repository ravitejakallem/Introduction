
public class Variables {
	
	static int num1=10; //Static variables
	int num2=30;     //Instance variables-->We can access instance variable by constructing an object.

	public static void main(String[] args) {
		int num=5;  //Local variables
		System.out.println("the value present in the Local variable is :" +num);
		System.out.println("the value present in the Static variable is :" +num1);
		
		Variables obj=new Variables();
		System.out.println("the value present in the instance variable is :"+obj.num2);
		
		

	}

}
