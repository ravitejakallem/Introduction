import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenShot {
	
	/*public static void capturescreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
        
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile); //copysource file to target file
	}*/

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//capturescreenshot(driver);
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//2)capture screenshot of specific section
		WebElement specificLaptop=driver.findElement(By.xpath("//div[@data-id='COMGYHP5ZB4AGZH6']"));
		
		File sourcefile=specificLaptop.getScreenshotAs(OutputType.FILE); //after selenium 4 we have this feature
        
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\specificpage.png");
		sourcefile.renameTo(targetfile); //copysource file to target file
		
	}

}
