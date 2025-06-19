package CoreJava;

public class StaticVar {

	String name;  // instance variables
	String street;
	static String City;  // class variables
	static String swarg="Hyd";
static int i;// whenever we declare integer as static it will increment based on object creation
	static {
		City="Banglore";
		int i=0;
	}
	
	StaticVar(String name,String street){  //local variables
		this.name=name;
		this.street=street;   //this will always points to instance variables
		i++;
		System.out.println(i);
	}
	
	public void getStreet() {
		System.out.println(street+ "      "+City);
	}
	
	public static void getCity() {
		System.out.println(City);
	}
	
	public static void getCityTop()
	{
		System.out.println(swarg);
	}
	
	public static void main(String[] args) {
		StaticVar obj=new StaticVar("Ram","itpl");            // as everytime banglore is common and memory is wasting using static keyword
		StaticVar obj1=new StaticVar("Ravi","Whitefield"); // which will be common for all objects
		StaticVar obj2=new StaticVar("Sai","Kormanagala");
        obj.getStreet();
        obj1.getStreet();
        StaticVar.getCity();
        getCityTop();
        i=5;
        StaticVar.i=9;
        
	}

}
