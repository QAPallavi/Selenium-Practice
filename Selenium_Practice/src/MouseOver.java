import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main (String[]args) throws InterruptedException {
		   
		  //Create ChromeWebDriver Instance
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); 
		  
		  //Launching sample site for testing
		  driver.get("https://artoftesting.com/sampleSiteForSelenium");
		  driver.manage().window().maximize();
		  
		  //MouseOver on Submit button
		  Actions action = new Actions (driver);
		  WebElement Submit = driver.findElement(By.id("idOfButton"));
		  action.moveToElement(Submit).perform();
		  
		  //Thread.sleep just for user to notice the event 
		  Thread.sleep(10000);
			
		  //Closing the driver instance
		  driver.quit();
		  
		}	
}
