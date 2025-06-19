package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * Login   -->@BeforeClass
 * Search  -->@Test
 * advanced search -->@Test
 * logout  -->@AfterClass
 */
public class AnnotationsDemo2 {
	
	@BeforeClass()
	void login() {
		System.out.println("login....");
	}
    @Test(priority=1)
	void search() {
		System.out.println("search operation...");
	}
	@Test(priority=2)
	void advancesearch() {
		System.out.println("Advanced search operation.......");
	}
	@AfterClass()
	void logout() {
		System.out.println("Logout from application..");
	}
}
