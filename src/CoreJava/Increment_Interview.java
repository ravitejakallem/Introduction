package CoreJava;

public class Increment_Interview {

	static int a=10;
	int b=20;
	public static void main(String[] args) {
		int c=30;
		Increment_Interview h1=new Increment_Interview();
		Increment_Interview h2=new Increment_Interview();
		c++;
		System.out.println(c);  //31
		System.out.println("Hello"+"           "+h1.a++); //Hello10
		System.out.println("Hello"+ "          "  +h1.b++); //Hello20
		System.out.println("Hello"+ "          "  +h2.a++);  //Hello11
		System.out.println("Hello"+ "          "  +h2.b++);  //hello20

		System.out.println("Interview open:");
		int d=0;
		int e=d;
		 e=d++;
		System.out.println(d+ "  "+e);
		 
		
		System.out.println("Interview close");
		
		//case1:
		int z=10;
		System.out.println(z); //10
		z++;
		System.out.println(z); //11
		
		//case2:
		int y=20; // post increment the value is first assigned to variable then it will be incremented.
		System.out.println(y);  //20
		int x=y++; //post increment
		System.out.println(x);  //20
		System.out.println(y);  //21
		
		//case3:
		int t=50; // pre increment the value is first incremented and then assigned to variable.
		System.out.println(t);  //50
		int v=++t; //pre increment
		System.out.println(v);  //51
		System.out.println(t);  //51
	}

}
