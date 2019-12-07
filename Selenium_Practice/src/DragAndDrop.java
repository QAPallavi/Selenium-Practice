import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args)  {
		
		  //Create Driver Object for Chrome Browser
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  //Launching sample site for testing
		  driver.get("https://artoftesting.com/sampleSiteForSelenium");
		  	   
		  //WebElement on which drag and drop operation needs to be performed
		  WebElement from = driver.findElement(By.cssSelector("img#sourceImage"));

		  //WebElement to which the above object is dropped
		  WebElement to = driver.findElement(By.cssSelector("div#targetDiv"));
		    
		  //Creating object of Actions class to build composite actions
		  Actions builder = new Actions(driver);
		   
		  //Building a drag and drop action
		  Action dragAndDrop = builder.clickAndHold(from)
		  		     .moveToElement(to)
		  		     .release(to)
		          	 .build();

		  //Performing the drag and drop action
		  dragAndDrop.perform();
		 
		  driver.close();
	 } 
}
