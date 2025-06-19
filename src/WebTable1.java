import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();		
		//how to find number of rows
		int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]")).size();
		System.out.println(rows);
		
		//how to find number of columns
				int columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size(); //findelements- size
				System.out.println(columns);
				
				//How to find specific  row and column data
				String value=driver.findElement(By.xpath("//table[@id='customers']//tr[3]/td[1]")).getText(); //findelement- getText
				System.out.println("the value is:" +value );
				String value1=driver.findElement(By.xpath("//table[@id='customers']//tr[6]/td[2]")).getText();
				System.out.println(value1);
				
				// Print all the data available in table.
				
				for(int r=2;r<=rows;r++)
				{
					
				for(int c=1;c<=columns;c++) 
					{

						String Alldata=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
						System.out.println("values are :" + Alldata);
					}
				}
				
				//Print contact and country name of Ernst Handel
				for(int a=2;a<=rows;a++)
				{
					String name=driver.findElement(By.xpath("//table[@id='customers']//tr["+a+"]/td[1]")).getText();
				 if(name.equals("Ernst Handel"))
				 {
					 String contact=driver.findElement(By.xpath("//table[@id='customers']//tr["+a+"]/td[2]")).getText();
					 String country=driver.findElement(By.xpath("//table[@id='customers']//tr["+a+"]/td[3]")).getText();
					 
					 System.out.println(name + "   "+country+ "    " + contact);
				 }
				
					
					
				}
				driver.quit();
				
		
	}

}
