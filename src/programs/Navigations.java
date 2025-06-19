package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com ");
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.com ");
		driver.navigate().to("https://www.Flipkart.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

	}

}
