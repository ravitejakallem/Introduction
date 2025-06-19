import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDomelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#input")).sendKeys("Welcome");//no such element error as it is shadow element 

		//shadow DOM-->Shadow root -->element
		SearchContext shadow=driver.findElement(By.cssSelector("book-app[apptitle='BOOKS'] ")).getShadowRoot();
		//return type is searchcontext interface and getShadowRoot is the method.
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");
	}

}
