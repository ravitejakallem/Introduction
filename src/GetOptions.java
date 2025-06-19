import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class GetOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Assertion assertion=new Assertion();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/div[@class='css-1dbjc4n'])[6]")).click();
		int i=driver.findElements(By.cssSelector(".css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-1rjd0u6.r-1g94qm0.r-h3f8nf.r-u8s1d.r-8fdsdq ")).size();
		System.out.println(i);
		List<WebElement> options=driver.findElements(By.cssSelector(".css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-1rjd0u6.r-1g94qm0.r-h3f8nf.r-u8s1d.r-8fdsdq "));
		for(WebElement option: options) {
			
			if(option.getText().equals("INR"))
			{
				option.click();
				break;
			}
		}

	}

}
