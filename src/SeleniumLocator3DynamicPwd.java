import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class SeleniumLocator3DynamicPwd {

	public static void main(String[] args) throws InterruptedException {
		String name="Ravi";
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.id("chkboxOne")).click();
	     driver.findElement(By.cssSelector("button[class*='submit']")).click();
	     Thread.sleep(2000);
	     
	     Assertion as = new Assertion();
	     as.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	     driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class*='pwd']")).click();
	    String PasswordExt=driver.findElement(By.cssSelector("form p")).getText();
	    String[] passwordarray=PasswordExt.split("'");
	    //passwordarray[0]=Please use temporary password
	    //passwordarray[1]=rahulshettyacademy' to Login.
	    String password=passwordarray[1].split("'")[0];
	    //password[0]=rahushettyacademy
	    //password[1]=' to Login.
	    return password;
	    
	    
	    
	}
	
	
}
