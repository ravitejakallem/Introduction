package CoreJava;

public class parameterizedConstructor {
	
	public parameterizedConstructor() {
		System.out.println(" I am in default constructor");
	}
	
	public parameterizedConstructor(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	public parameterizedConstructor(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterizedConstructor p=new parameterizedConstructor();
		parameterizedConstructor num=new parameterizedConstructor(4,4);
		parameterizedConstructor sts=new parameterizedConstructor("Ravi");

	}

}
