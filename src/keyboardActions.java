import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		 driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
		 
		 //ctrl+a
		 
		 a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		 
		 //ctrl+c
		 a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		 
		 //tab
		 a.keyDown(Keys.TAB).keyUp(Keys.CONTROL).perform();
		 
		 //ctrl+v
		 a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
