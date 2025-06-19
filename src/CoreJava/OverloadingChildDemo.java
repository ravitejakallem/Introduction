package CoreJava;

public class OverloadingChildDemo {

	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a,int b) {
		System.out.println(a + b);
		System.out.println(a);
	}
	public static void main(String[] args) {
		OverloadingChildDemo og=new OverloadingChildDemo();
		og.getData(16);
		og.getData("Ravi");
		og.getData(16, 26);

	}

}
