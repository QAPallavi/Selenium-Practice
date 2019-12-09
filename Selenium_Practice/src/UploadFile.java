import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		
		//Create ChromeWebDriver Instance
		String baseUrl = "http://demo.guru99.com/test/upload/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		
		Thread.sleep(3000);
		
		//Enter the file path onto the file-selection input field
		uploadElement.sendKeys("C:\\Users\\PALLAVI\\Downloads\\530VzoU.jpg");
		
		Thread.sleep(3000);
		
		//Check on the Check box
		driver.findElement(By.id("terms")).click();
		
		Thread.sleep(3000);
		
		//Click on Submit button
		driver.findElement(By.id("submitbutton")).click();
		
		driver.quit();
	}
}
