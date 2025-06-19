package CoreJava;

import org.checkerframework.checker.units.qual.cd;

public class IndianTrafficRules implements CentralTraffic,AmericanTraffic{    //class can implement multiple interfaces

	public static void main(String[] args) {
		CentralTraffic a=new IndianTrafficRules();
		a.greenGo();
		AmericanTraffic b=new IndianTrafficRules();
		b.BikerTraffic();
		IndianTrafficRules c= new IndianTrafficRules();
		c.RedStop();
		c.pedestrian();
        c.BikerTraffic();
        
	}

	@Override
	public void greenGo() {
		System.out.println("GreenGo");
		
	}
	
	public void pedestrian()
	{
		System.out.println("dance");
	}

	@Override
	public void YellowReadytoMove() {
		System.out.println("YellowReadytoMove");
		
	}

	@Override
	public void RedStop() {
		System.out.println("RedStop");
		
	}

	@Override
	public void BikerTraffic() {
		System.out.println("Ride a Bike like Ravi");
		
	}

}
