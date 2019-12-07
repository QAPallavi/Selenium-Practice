import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main (String[]args) throws InterruptedException {
		   
		  //Create ChromeWebDriver Instance
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();  
		  
		  //Launching sample site for testing
		  driver.get("https://artoftesting.com/sampleSiteForSelenium");
		  
		  //Double click to launch an alert box
		  Actions action = new Actions (driver);
		  WebElement alertbox = driver.findElement(By.id("dblClkBtn"));
		  action.doubleClick(alertbox).perform();
		  
		  //Thread.sleep just for user to notice the event
		  Thread.sleep(3000);
			
		  //Closing the driver instance
		  driver.quit(); 
		}
}
