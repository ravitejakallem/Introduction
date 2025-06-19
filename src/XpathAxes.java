import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		
		/*
		 * parent:: child:: ancestor:: descendant:: following:: following::input[first]
		 * following::input[last] preceding:: preceding::input[first]
		 * preceding::input[last] following-sibling:: preceding-sibling::
		 * 
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		//xpath with multiple attributes
		driver.findElement(By.xpath("//input[@type='text'][@name='srchword']")).sendKeys("Tata motors");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//xpath with 'AND'   'OR' Operators
		
		//input[@type='text'and @name='srchword']
		//input[@type='text' or @name='srchword']
		
		//xpath with contains() and starts-with()
		
		//driver.findElement(by.xpath("//input[contains(@placeholder,'Sea')])).sendkeys();
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea'])).sendkeys();
		
	}

}
