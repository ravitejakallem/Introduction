package CoreJava;

public class ConstructorDemo {
	
	//Constructor will not return values
	// Constructor name should be same as classname
	//Variables or objects will be invoked(Called) at the time of Object creation.
	
	public ConstructorDemo(){
		System.out.println("I am default constructor");
		System.out.println("to intalize variables in to object i will be called ");
	}
	
	public void getData()
	{
		System.out.println("i am the method");
	}

	public static void main(String[] args) {
		ConstructorDemo cd=new ConstructorDemo();
		//whenever you create object constructor is called:
		

	}

}
