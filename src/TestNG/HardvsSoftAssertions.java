package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {
	
	//@Test
	/*void test_hardassertions() {
		
		//In Hard assertion when validation fails script will not execute pending tests but in soft assertion even though validation fails script will execute pending steps.
		
		System.out.println("test...");
		System.out.println("interview..");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("testing...");
		System.out.println("automation..");
	}*/
	
	@Test
	void test_softAssertions() {
		
		System.out.println("oracle test...");
		System.out.println("quality engineer");
		
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(1, 2); //soft assetion
		
		System.out.println("automation testing");
		System.out.println("through Java with testng");
		
		sa.assertAll(); // mandatory (if we don't use validation will pass even though it is failed.
	}

}
