package TestNG;

import org.testng.annotations.Test;

public class Groupingpayments {

	@Test(priority=1,groups= {"Sanity","Regression","Functional"})
void paymentinrupees() {
	System.out.println("payment in rupees is successful");
}

	@Test(priority=2,groups= {"Sanity","Regression","Functional"})
void paymentindollars() {
	System.out.println("payment in dollars is successful");
}

}
