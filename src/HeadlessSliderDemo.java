
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HeadlessSliderDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("--headless=new"); // setting for headless mode of execution
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		System.out.println(min_slider.getLocation());
		a.dragAndDropBy(min_slider, 99, 288).build().perform();
		System.out.println("Location of min slider after moving"+ min_slider.getLocation());
		
		WebElement max_slider=driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
		System.out.println(max_slider.getLocation());
		a.dragAndDropBy(max_slider, -80, 0).perform();
		System.out.println("Location of max slider after moving"+ max_slider.getLocation());
		
	}

}
