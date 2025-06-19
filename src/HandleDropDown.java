import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/ ");
		driver.manage().window().maximize();
		WebElement dropele=driver.findElement(By.name("Country"));
		
		Select dropdown=new Select(dropele);
		dropdown.selectByVisibleText("Ghana");
		/*dropdown.selectByValue(null);
		dropdown.selectByIndex(0);*/
		//selecting option from dropdown without using methods
		List<WebElement>alloptions=dropdown.getOptions();
		for(WebElement options:alloptions)
		{
			if(options.getText().equals("Cuba"))
			{
				options.click();
				break;
			}
		}
		

	}

}
