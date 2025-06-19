import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Ravikallem");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ravikallem");
		driver.findElement(By.className("signInBtn")).click();

	}

}
