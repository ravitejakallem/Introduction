
public class StaticBlockMethodVariable {
	
	static int a=10; // static variable
	static void display() // static method
	{
		System.out.println("Static Method");
	}
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		final int z=100;
		System.out.println(z);
		System.out.println(a);
		
		display();

	}

}
