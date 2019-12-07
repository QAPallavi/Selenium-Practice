import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasicCommands {
	
     public static void main (String[]args) throws InterruptedException {
		
		//Create ChromeWebDriver Instance
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		
		//Set Implicit Wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Launch sampleSiteForSelenium
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
					
		//Fetch the text "This is sample text!" and print it on console
		//Use the id of the div to locate it and then fetch text using getText() method
		String sampleText = driver.findElement(By.id("idOfDiv")).getText();
		System.out.println(sampleText);
			
		//Waiting for 3 seconds just for user to efficiently check automation
		//Its not mandatory though
		Thread.sleep(2000);
			
		//Using linkText locator to find the link and then using click() to click on it
		driver.findElement(By.linkText("This is a link")).click();
			
		Thread.sleep(2000);
		
		//Finding text box using id locator and then using send keys to write in it
		driver.findElement(By.id("fname")).sendKeys("Pallavi Sinha");
			
		Thread.sleep(2000);
		
		//Clicking on button using click() command
		driver.findElement(By.id("idOfButton")).click();
			
		Thread.sleep(2000);
			
		//Find radio button by name and check it using click() function
		driver.findElement(By.id("female")).click();
			
		Thread.sleep(2000);
			
		//Find check box by cssSelector and check it using click() function
		driver.findElement(By.cssSelector("input.Performance")).click();
				
		Thread.sleep(2000);
			
		//Using Select class for for selecting value from drop down
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Manual Testing");
			
		Thread.sleep(5000);
		
		//Close the browser
		driver.quit();
		
		System.out.println("Automation done successfully!");

		}
	}