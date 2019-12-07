import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {
	
	public static void main (String[]args){
		   
		  //Create ChromeWebDriver Instance
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  //Launching sample web site
		  driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		  driver.manage().window().maximize();
		  
		  //Get list of web-elements with tagName  - a
		  List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		  
		  //Traversing through the list and printing its text along with link address
		  for(WebElement link:allLinks){
			  
			  System.out.println(link.getText() + " - " + link.getAttribute("href"));
			  
			}
			
			//Commenting driver.quit() for user to verify the links printed
			driver.quit();
		  
	}		  

}
