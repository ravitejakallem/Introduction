import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pavan_datePickerdemo2 {
	
	//converting month from string -->Month object.
	static Month convertmonth(String month) {
		
		HashMap<String, Month> mp=new HashMap<String, Month>();
		mp.put("January", Month.JANUARY);
		mp.put("February", Month.FEBRUARY);
		mp.put("March", Month.MARCH);
		mp.put("April", Month.APRIL);
		mp.put("May", Month.MAY);
		mp.put("June", Month.JUNE);
		mp.put("July", Month.JULY);
		mp.put("August", Month.AUGUST);
		mp.put("September",Month.SEPTEMBER);
		mp.put("October", Month.OCTOBER);
		mp.put("November", Month.NOVEMBER);
		mp.put("December", Month.DECEMBER);
		
		Month m=mp.get(month);
		
		if(m==null)
		{
			System.out.println("Invalid month..");
		}
		
		return m;
		
		
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String requiredMonth="June";
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		WebElement yeardropdown=driver.findElement(By.className("ui-datepicker-year"));
		
		Select year=new Select(yeardropdown);
		year.selectByVisibleText("2025");
	
		while(true)
		{
		String displaymonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		//convert requiredmonth & displaymonth in to month objects.
		
		Month expectedMonth=convertmonth(requiredMonth);  //January ,June
		Month currentMonth=convertmonth(displaymonth);  //April    
		
		//jan<April   --->Past
		//June>April  -->Future
		
		//compare
	int res=expectedMonth.compareTo(currentMonth);  //returns 0-->current month && expected month, >0 (June>April -->Future month)  <0 (June<july-->past month) 
		
	if(res<0)
	{
		//past month
		driver.findElement(By.xpath(displaymonth));
	}
	
	else if(res>0)
	{
		//future month
		driver.findElement(By.xpath(requiredMonth));
	}
	
	else {
		break;
	}
	
	
	
		} 
	}

}
