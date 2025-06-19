package TestNG;

import org.testng.annotations.Test;

public class GroupingloginMethod {
	@Test(priority=1, groups= {"Sanity"})
	void loginbyemail() {
		System.out.println(" login by email is successful..");
	}
	@Test(priority=2, groups= {"Sanity"})
void loginbyfacebook() {
		System.out.println("login by facebook is successful");
	}
	@Test(priority=3, groups= {"Sanity"})
void loginbytwitter() {
	System.out.println("login by twitter is successful");
}
}
