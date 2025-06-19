
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;




public class SeleniumIntroductionLocators2 {

	
	
	public static void main(String[] args) throws InterruptedException {
		String name="Ravi";
	System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
    //List<Webelement>=driver.findElements(By.ByXPath(a#navbtn_tutorials));
	//driver.close();
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys("Ravi123");
	driver.findElement(By.xpath("//button[@type='submit'] ")).click();

	//CSS-->Classname-->tagname.classname
	//CSS-->id-->tagname#id
	
	//xpath=//input[@type='Text'] but for CSS we have to write the syntax as input[type='Text']:nth-child(Index values)
	
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());;
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Name'] ")).sendKeys(name);
	driver.findElement(By.xpath("//input[@placeholder='Email'] ")).sendKeys("Ravi@123");
	driver.findElement(By.xpath("//input[@placeholder='Phone Number'] ")).sendKeys("123456789");
	
	//*********************Regular Expression*****************************************
	//Let us say attribute values are changing in Html for that we can go with Regular expression for CSS and Xpath.
	//for css we use tagname[attribute*='value']  eg: input[type*='pass']
	//for Xpath we use //tagname[contains(@attribute,'Value')]  eg: //button[contains(@class,'Submit')]
	
     driver.findElement(By.cssSelector("button[class*='pwd']")).click();
     System.out.println(driver.findElement(By.cssSelector("form p")).getText());
     driver.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
     driver.findElement(By.id("chkboxOne")).click();
     driver.findElement(By.cssSelector("button[class*='submit']")).click();
     Thread.sleep(2000);
     
     Assertion as = new Assertion();
     as.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
     
     as.assertEquals(driver.findElement(By.xpath("//h2")).getText(),"Hello "+name+",");
     driver.findElement(By.xpath("//button[text()='Log Out']")).click();
     driver.close();
    
	}

}
