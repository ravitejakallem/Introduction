package CoreJava;

public class thisDemo {
int a=3;

public void getData()
{
int b=	a*this.a;
	int a=6;
	System.out.println(a);
	System.out.println(this.a); // this keyword always refers to current object- class level
	System.out.println(b);
}

	
	
	public static void main(String[] args) {
		thisDemo t= new thisDemo();
		t.getData();

	}

}
