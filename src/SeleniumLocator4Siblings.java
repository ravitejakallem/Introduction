import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator4Siblings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String val=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		//sibling traverse is done as the Parent has 3 values and second value may change we write sibling traverse
		//syntax is following-sibling::tagname;
		System.out.println(val);
//child to Parent traversing
	
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		// Parent::Tagname
		//driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).getText();
	}
	
	

}
