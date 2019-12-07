import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommands2 {
	
public static void main (String[]args) {
		
		//Create Driver Object for Chrome Browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();  
	
	   //Hit URL on the browser
	driver.get("https://www.google.com/");
	
	  //To validate page name is correct
	System.out.println (driver.getTitle());
	
	  //To validate URL
	System.out.println (driver.getCurrentUrl());
	
	  //To print Page source
	  //System.out.println (driver.getPageSource());
	
	  //To navigate to different browser
	driver.get("http://www.yahoo.com/");
	driver.navigate().back();
	
	  //To close the current browser window 
	driver.close();
	
	  //To close all the browser windows opened by selenium script
	driver.quit();
   }
}
