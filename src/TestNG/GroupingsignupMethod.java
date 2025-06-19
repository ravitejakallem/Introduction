package TestNG;

import org.testng.annotations.Test;

public class GroupingsignupMethod {
	
	@Test(priority=1,groups= {"Regression"})
	void signupbyemail() {
		System.out.println("sign up by email is successful");
	}

	@Test(priority=2,groups= {"Regression"})
	void signupbyfacebook() {
		System.out.println("sign up by facebook is successful");
	}
	@Test(priority=3,groups= {"Regression"})
		void signupbytwitter() {
			System.out.println("sign up by twitter is successful");
		}
}
