package programs;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShubhamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.memix.com/explore/trending/");
		driver.manage().window().maximize();
		int s =driver.findElements(By.xpath("//div[@class='memix-search-shortcuts flex-shrink-0']/ul/li")).size();
		System.out.println(s);
		
		for(int i=1;i<s;i++) {
String Alldata=driver.findElement(By.xpath("//div[@class='memix-search-shortcuts flex-shrink-0']/ul/li["+i+"]")).getText();	
System.out.println("values are :" + Alldata);

		}

		String s1=driver.findElement(By.xpath("//div[@class='memix-search-shortcuts flex-shrink-0']/ul/li[12]")).getText();
System.out.println(s1);
	}

}
