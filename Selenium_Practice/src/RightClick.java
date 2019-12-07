import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main (String[]args) throws InterruptedException {
		   
		  //Create ChromeWebDriver Instance
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe"); 	
		  WebDriver driver=new ChromeDriver();  
			
		  //Launch sampleSiteForSelenium
	      driver.get("https://artoftesting.com/sampleSiteForSelenium");
				
		  //Right click in the Textbox
		  Actions action = new Actions (driver);
		  WebElement Searchbox = driver.findElement(By.id("fname"));
		  action.contextClick(Searchbox).perform();
		     
		  //Thread.sleep just for user to notice the event
		  Thread.sleep(3000);
			
		  //Closing the driver instance
		  driver.quit();  
	    }
}
