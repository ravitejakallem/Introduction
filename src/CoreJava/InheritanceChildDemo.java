package CoreJava;

public class InheritanceChildDemo extends InheritanceParentDemo {
	String name ="QAClickAcademy";


	public InheritanceChildDemo()
	{
		super();                // this should be always be at first line
	System.out.println("child class construtor");
	

	}
	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.name); //if we use super keyword it will pick data from parent class.
	}


	public void getData()
	{
	super.getData();
	System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		InheritanceChildDemo cd = new InheritanceChildDemo();

		cd.getStringdata();
		cd.getData();

	}

}
