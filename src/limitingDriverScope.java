import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limitingDriverScope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver=driver.findElement(By.xpath("//div[@id='gf-BIG']")); //limiting webdriver
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
        WebElement colDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        int a=colDriver.findElements(By.tagName("a")).size();
		System.out.println(a);
		
		for(int i=1;i<a;i++)
		{
			String hyperlinkclick=Keys.chord(Keys.CONTROL,Keys.ENTER);
			colDriver.findElements(By.tagName("a")).get(i).sendKeys(hyperlinkclick);
		}
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		while(it.hasNext())  //checks whether next element is present or not.
		{
			
			driver.switchTo().window(it.next());
			  System.out.println(driver.getTitle());
		}
		
		driver.quit();
	}

}
