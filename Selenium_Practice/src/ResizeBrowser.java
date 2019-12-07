import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeBrowser {
	
      public static void main(String[] args) {
		
		//Launching Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Launching sample site for testing
		driver.get("https://artoftesting.com/sampleSiteForSelenium");
				
		int width = 600;
		int height = 400;
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
				
	}

}
