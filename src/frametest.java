import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frametest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		Actions a =new Actions(driver);
		WebElement source=driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target=driver.findElement(By.cssSelector("div[id='droppable']"));
	    a.dragAndDrop(source, target).build().perform();
	    driver.switchTo().defaultContent();
	    

	}

}
