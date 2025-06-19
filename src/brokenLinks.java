import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		List<WebElement> count = driver.findElements(By.tagName("a"));
		System.out.println(count.size());

		for (WebElement element : count) {

			String envstatus=element.getAttribute("href");
			
			if(envstatus==null || envstatus.isEmpty()) {
				System.out.println("we cannot get status of the broken links");
				continue;
			}
			
			try
			{
			//establish connection and hit URL to the server
             URL u=new URL(envstatus); //CONVERTING STRING TO URL
             HttpURLConnection connlinkurl=(HttpURLConnection) u.openConnection(); //open connection to SERVER
             connlinkurl.connect(); //connected to serve and send request to server
             if(connlinkurl.getResponseCode()>=400)
             {
            	 System.out.println("It is a broken link");
             }
             else {
            	 System.out.println("It is not an broken link");
             }
		}
		
		catch(Exception a)
		{
		}
	}
	}
}
