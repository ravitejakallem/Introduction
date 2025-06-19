
public class ConstructorBasics {
	
	String name;
	int rollno;
	static char section='B';
	
	ConstructorBasics() // Default constructor
	{
		name="Raviteja";
		rollno=45678;
		
	}
	
	ConstructorBasics( String str,int n, char C) // parameterized constructor
	{
        name= str;
        rollno=n;
        section=C;
      
		
	}
	
	public static void main(String[] args) {
		ConstructorBasics CB= new ConstructorBasics();
		ConstructorBasics CB2= new ConstructorBasics("Kallem",123,'C');
		 System.out.println(CB.name);
		 System.out.println(CB.rollno);
		 System.out.println(section);
		 System.out.println(CB2.name);
		 System.out.println(CB2.rollno);
		 System.out.println(section);
		 

		 
		 
	}

}
