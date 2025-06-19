package CoreJava;

public class MethodOverloading {
	public void getData(int a)
	{
	System.out.println(a);
	}

	public void getData(String a)
	{
	System.out.println(a);
	}
	
	public void getData(int a,int b)
	{
	System.out.println(a+b);
	}

	public static void main(String[] args) {
	MethodOverloading m=new MethodOverloading();
	m.getData(6);
	m.getData("Ravi");
	m.getData(1, 6);

	}

}
