package TestNG;

import org.testng.annotations.Test;

/*
 * Open app
 * Login
 * Logout
 * Testng executes tests/methods in alphabetical order
 * by using priority we can define the sequence @Test(priority=num) controls order of execution.
 * once you provide priority to test methods, then order of method is not considered.
 * if you dont provide priority then default value is zero.
 * we can also provide -ve numbers in priority          -4 -3 -2 -1 0 1 2 3 4 
 * TestNg execute test methods only if they have @test annotations.
 * we can execute test cases using testNG xml file****************************
 * 
 * @Test
 * ---------
 * priority
 * dependsOnMethods
 * groups
 */

public class firstTestCase {
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Opening application...");
	}
	@Test(priority=2)

	void login() {
		System.out.println("Login to application....");
		
	}
	
	@Test(priority=3)
	void logout() {
		
		System.out.println("Logout from application....");
	}
}
