import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class VegetableCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Assertion assertion=new Assertion();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
		String name=products.get(i).getText();
		
		System.out.println(name);
		
		if(name.contains("Cucumber"))
		{
			driver.findElements(By.xpath("//button[normalize-space()='ADD TO CART']")).get(i).click();
			break;
		}
		}
		
		
		
		/*for(WebElement option:products) {
			
			System.out.println(option.getText());
			
			if(option.getText().equalsIgnoreCase("Cucumber - 1 Kg")) {
				driver.findElements(By.xpath("//button[normalize-space()='ADD TO CART']"))click();
			}
			else {
				System.out.println("cucumber not found");
			}*/
		}

	}


