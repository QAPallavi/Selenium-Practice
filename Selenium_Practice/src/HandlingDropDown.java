import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	
	public static void main (String[]args) throws InterruptedException {
		   
        //Create ChromeWebDriver Instance
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
			
	    //Launch sampleSiteForSelenium
	    driver.get("https://artoftesting.com/sampleSiteForSelenium");
	      
	    //Using Select class for for selecting value from dropdown
	    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Manual Testing");
				
		Thread.sleep(3000);
			
		//Close the browser
	    driver.close();     
	 }
}
