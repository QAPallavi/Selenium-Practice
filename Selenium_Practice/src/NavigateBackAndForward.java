import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForward {
	
public static void main(String[] args) throws InterruptedException {
		
		//Launching Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
				
		//Navigating to the desired web site
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		
		Thread.sleep(4000);
				
		//Clicking a link
		WebElement artOfTestingLogo = driver.findElement(By.cssSelector("div.navbar-header")); 
		artOfTestingLogo.click();
		
		//Navigating back in browser
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		//Navigating forward in browser
		driver.navigate().forward();
		
		driver.close();
		
	}
}