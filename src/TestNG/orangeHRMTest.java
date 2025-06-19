package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 * Open application
 * test logo presence
 * login
 * close
 */

public class orangeHRMTest {
	WebDriver driver; //driver we need to create outside method but instantation we need to do inside method
	
	@Test(priority=1)
	void openapp() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}
	@Test(priority=2)
	void testlogo() throws InterruptedException {
		Thread.sleep(3000);
	boolean status=	driver.findElement(By.cssSelector("img[alt='company-branding']")).isDisplayed();
		System.out.println("Logo displayed..."+status);
	}

	@Test(priority=3)
	void testLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	@Test(priority=4)
	void closeApp() {
		driver.close();
		
	}
}
