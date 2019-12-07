import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks2 {
	
	public static void main (String[]args) {
		
		 //Create ChromeWebDriver Instance
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.navigate().to("http://www.issuewire.com");
	      java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println("Number of Links in the Page is " + links.size());
	      
	      for (int i = 1; i<=links.size(); i = i+1) {
	          System.out.println("Name of Link# " + i + links.get(i).getText());        
	    }
    }	      
}
