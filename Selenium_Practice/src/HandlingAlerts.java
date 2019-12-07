import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	
	public static void main (String[]args) throws InterruptedException {
		
		  //Create ChromeWebDriver Instance
	      System.setProperty("webdriver.chrome.driver", "C:\\Testing\\ChromeDriver\\chromedriver.exe");	
		  WebDriver driver=new ChromeDriver();  
			  
		  //Launching sample site for testing
		  driver.get("https://artoftesting.com/sampleSiteForSelenium");
		  
		  //Handling alert boxes
		  //Click on generate alert button
		  driver.findElement(By.cssSelector("div#AlertBox button")).click();
			
		  Thread.sleep(3000);
			
		  //Using Alert class to first switch to or focus to the alert box
		  Alert alert = driver.switchTo().alert();
		  
		  //Using accept() method to accept the alert box
		  alert.accept();
				
		  //Handling confirm box
		  //Click on Generate Confirm Box
		  driver.findElement(By.cssSelector("div#ConfirmBox button")).click(); 
				
		  Thread.sleep(3000);
				
		  Alert confirmBox = driver.switchTo().alert();
				
		  //Using dismiss() command to dismiss the confirm box
		  //Similarly accept can be used to accept the confirm box
		  confirmBox.dismiss();
		  
		  //Close the browser
		  driver.close();
		}
}
