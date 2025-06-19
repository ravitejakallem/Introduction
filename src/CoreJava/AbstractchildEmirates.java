package CoreJava;

public class AbstractchildEmirates extends AbstractPublicAirCraft {
	
	public static void main(String[] args) {
		
		AbstractchildEmirates a=new AbstractchildEmirates();
		a.bodyColour();
		a.engine();
		a.safetyGuidelines();
		
		//AbstractPublicAirCraft b=new AbstractPublicAirCraft();-->cannot instantate Abstract class.
	}

	@Override
	public void bodyColour() {
		System.out.println("colour should be red");
		
	}

}
