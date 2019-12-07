import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {
	
	public static void main(String[] args) {
		
	    //Create ChromeWebDriver Instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
	    //Launching sample site for testing
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
		
		//To maximize the window.
		driver.manage().window().maximize();
		
		//This will scroll the page by 1000 pixels
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 1000)");
		
	}

}
