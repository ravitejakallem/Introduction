package CoreJava;

public abstract class AbstractPublicAirCraft {  //in abstraction we have implemented and unimplemented methods together but in interface we have only unimplemented methods

//when a method is defined abstract then class is also abstract
	//Method shouldn't be private access modifier it should be always public
	//we cannot create instance for abstract class--meaning abstractclass a = new abstractclass() not possible
	// Default -->We can access methods and varaibles within package
	//private --> We can access methods and variables only in the class
	//public -->we can access methods and variables any where
	//protected -->we can access methods and variables in the package and also in the child class which inherit parent class outside package.
	                                                                                                                                              
	public void engine()
	{
		System.out.println("Follow Engine Guidelines");
	}

	public void safetyGuidelines()
	{
		System.out.println("Follow safety Guidelines");
	}
	
	public abstract void bodyColour();
}
