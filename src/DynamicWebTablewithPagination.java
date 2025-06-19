import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWebTablewithPagination {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		WebElement Username=driver.findElement(By.id("input-username"));
		takescreenshot(driver,"c:/documents");
		WebElement Password=driver.findElement(By.id("input-password"));
		Username.clear();
		Password.clear();
		Username.sendKeys("demo");
		Password.sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*WebDriverWait W=new WebDriverWait(driver,5);
		 * w.until(ExpectedConditions.visibilityofElementLocated(by.cssselector("input.promocode");
		 * set<string> windows=driver.getwindowhandles();
		 * Iterator<string> it=windows.iterator();
		 * String parentid=it.next();
		 * String childid=it.next();
		 * driver.switchto.window(childid);
		 * 		 */
		
		//sales-->orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		//driver.findElement(By.xpath("//a[@class='parent']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//find total number of pages in a table
		String Text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(Text);
		
		//how to get 23 pages which is present in bracket.
		/*string text=Showing 1 to 10 of 228 (23 Pages)
		text.indexof("(")  similarly text.indexOf("pages")
		text.substring(text.indexOf("(")+1,text.indexOf("pages")-1);
		In order to convert from string to integer we will write Integer.valueOf  */
		
		Integer totalpages=Integer.valueOf(Text.substring(Text.indexOf("(")+1,Text.indexOf("Pages")-1));
		System.out.println(totalpages);
		
		for(int p=1;p<totalpages;p++)
		{
			WebElement activepages=driver.findElement(By.xpath("ul[@class='pagination']/li/span"));
			System.out.println(activepages.getText());
			activepages.click();
			
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
			
			String pageno=Integer.toString(p+1);
			
			driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()=' "+pageno+" ']")).click();
		}
		
	}
	
	public static void takescreenshot(WebDriver webdriver,String filewithpath) {
		TakesScreenshot scrshot=((TakesScreenshot)webdriver);
		File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
	}

}
