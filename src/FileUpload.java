import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Raviteja/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='filesToUpload']"))
				.sendKeys("C:\\Users\\Raviteja\\Downloads\\Grad.jpg");
		if (driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("Grad.jpg")) {
			System.out.println("file uploaded successfully");
		} else {
			System.out.println("file upload failed");
		}

		// multiple file uploading
		String s1 = "C:\\Users\\Raviteja\\Downloads\\gradPc.jpg";
		String s2 = "C:\\Users\\Raviteja\\Downloads\\img013.jpg";

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(s1 + "\n" + s2);
		int nooffilesuploaded = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		if (nooffilesuploaded == 3) {
			System.out.println("files uploaded correctly");
		}

		else {
			System.out.println("files are not uploaded correctly");
		}

		// validation for the correct files
		if (driver.findElement(By.xpath("//ul[@id='fileList']/li[1]")).getText().equals("Grad.jpg")
				&& driver.findElement(By.xpath("//ul[@id='fileList']/li[2]")).getText().equals("gradPc.jpg")
				&& driver.findElement(By.xpath("//ul[@id='fileList']/li[3]")).getText().equals("img013.jpg")) {
			System.out.println("Correct files are uploaded");
		} else {
			System.out.println("Incorrect files got uploaded");
		}
	}

}
