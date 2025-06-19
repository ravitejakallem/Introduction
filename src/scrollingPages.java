import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingPages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://unclebigbay.com/10-custom-scrollbar-samples-for-your-next-project");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1) scroll by pixels
		//js.executeScript("window.scrollBy(0,2000)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//2)scroll the page till webelement is visible

		/*WebElement ele=driver.findElement(By.xpath("//h2[@id='heading-default-body-style-code']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));*/
		
		//3) if you scrolldown the page till bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));//28072

		//scroll up in to intial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
