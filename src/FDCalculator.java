import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String filepath=System.getProperty("user.dir")+ "\\TestData\\calData.xlsx";
		
		int rows=ExcelUtils.getRowCount(filepath, "Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
			
			// Read Data from Excel
			String princ=ExcelUtils.getCellData(filepath, "sheet1", i, 0);
            String	ROI=ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
            String	Prd1=ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
            String	Prd2=ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
            String	frq=ExcelUtils.getCellData(filepath, "Sheet1", i, 4);
            String	exp_mvalue=ExcelUtils.getCellData(filepath, "Sheet1", i, 5);
            
            //2) pass above data in to application.
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(ROI);
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(Prd1);
            
            Select valdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
            valdrp.selectByVisibleText(Prd2);
            
            Select frqdrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
            frqdrp.selectByVisibleText(frq);
            
            driver.findElement(By.xpath("//div[@class='CTR PT15']/a[1]")).click(); //calculate the amount
            
            //validation
            
            String act_mval=driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
            
            if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mval))
            {
            	System.out.println("Test passed");
            	ExcelUtils.setCellData(filepath, "Sheet1",i, 7, "Passed");
            	ExcelUtils.fillGreenColor(filepath, "Sheet1", i, 7);
            }
            else {
            	System.out.println("Test Failed");
            	ExcelUtils.setCellData(filepath, "Sheet1",i, 7, "Failed");
            	ExcelUtils.fillRedColor(filepath, "Sheet1", i, 7);
            }
            
            driver.findElement(By.xpath("//div[@class='CTR PT15']/a[2]")).click();  // clear the data
            }
            
			driver.quit();
			
			
			
		}
		
	}


