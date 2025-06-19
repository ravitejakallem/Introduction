import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class E2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Assertion assertion = new Assertion();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"))
				.click();
		driver.findElement(By.xpath("//div[normalize-space()='Kempegowda International Airport']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Indira Gandhi International Airport']")).click();
		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu"))
				.click();
		System.out.println(driver.findElement(By.xpath("(//div[normalize-space()='Senior Citizen'])[5]")).isSelected());
//assertion
		assertion.assertFalse(
				driver.findElement(By.xpath("(//div[normalize-space()='Senior Citizen'])[5]")).isSelected());

		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		System.out.println(driver.findElement(By.xpath(
				"//div[@data-testid='home-page-travellers']/div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"))
				.getText());

		int i = 1;
		while (i < 5) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}

		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		System.out.println(driver.findElements(By.cssSelector("circle[fill-rule='evenodd']")).size());
		driver.findElement(By.xpath("(//div[normalize-space()='Senior Citizen'])[5]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[normalize-space()='Senior Citizen'])[5]")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("circle[fill-rule='evenodd']")).size());// counting no of
																										// checkboxes
		System.out.println(driver.findElement(By.xpath(
				"//div[@data-testid='home-page-travellers']/div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"))
				.getText());
		assertion.assertEquals(driver.findElement(By.xpath(
				"//div[@data-testid='home-page-travellers']/div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']"))
				.getText(), "5 Adults");
		System.out.println(
				driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled());
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

	}

}
