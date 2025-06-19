import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		// when we perform click or sendkeys at the background Webdriver will
		// communicate with the Javascript elements and sometimes action will not be
		// successful at that time we can use Java script executor interface and can run
		// the scripts. -->******Mainly for element intercepted exception we use JSE***************8
		// JavascriptExecutor js=driver;

		JavascriptExecutor js = (JavascriptExecutor) driver; // typecasting as it is interface
		js.executeScript("arguments[0].setAttribute('value','Ravi')", name);

		WebElement clbtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", clbtn);
		
	}

}
