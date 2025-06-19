package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderdemo {

	WebDriver driver;
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(dataProvider="dp")
	void testLogin(String name,String password) {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Boolean status=driver.findElement(By.xpath("//div[@id='content']/h2[1]")).isDisplayed();
		if(status==true) {
			
			driver.findElement(By.xpath("//div[@class='list-group']/a[13]")).click();
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
		
	}
	@AfterClass
	void tearDown() {
		driver.quit();
		
	}
	
	@DataProvider(name="dp")  // we will give name to the data provide and link this with the actual test .we will pass data to the tests and without using loops we iterate the data.
	Object[][] loginData() {
			
Object data[][]= {
					{"abc@gmail.com", "test@123"},
					{"xyz@gmail.com", "test012"},
					{"John@gmail.com", "test@123"},
					{"ravitejaravi@gmail.com","Ravi@123"},
					{"saikallem@gmail.com","sai@123"},

			};
					return data;
		
	}
	


		
	
}
	

