import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	//static WebDriver driver = new ChromeDriver();
	
		public static void main(String[] args) {

		   //chromedriver.exe
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");

	       //Find Email & Password text box
	       WebDriver driver = new ChromeDriver();

	       driver.get("https://www.google.com");

	       driver.get("https://www.issuewire.com");

	       driver.get("https://www.issuewire.com/userlogin");

	       driver.findElement(By.id("email")).sendKeys("pallavi@elphilltechnology.com");

	       driver.findElement(By.name("password")).sendKeys("pallavi");

	       //To Click on "Login" button using XPath
	       driver.findElement(By.xpath ("//*[@id=\'submit-btn1\']")).click();
	       driver.quit();    
	  }

}
