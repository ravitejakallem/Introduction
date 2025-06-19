import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pavan_datePickerDemo {
	
	public static void futureDate(WebDriver driver,String year,String month,String date)
	{
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		// Method 2:

		// Getting Current month and year from the Webpage and comparing it with the
		// Inputs we give and if condition satisfied comeout if not click on next
		// button.
		while (true) {
			String webpagemonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String webpageyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(webpagemonth.equals(month) && webpageyear.equals(year))
			{
				break;
			}
			driver.findElement(By.className("ui-icon-circle-triangle-e")).click();
		}

		List<WebElement> dateselect=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement dt:dateselect)
		{
			if(dt.getText().equalsIgnoreCase(date))
			{
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	String year = "2025";
		String month = "May";
		String date = "16";*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/16/2025
		// "); -->One method
	
        futureDate(driver, "2028", "January", "16");
		
		
	}

}
