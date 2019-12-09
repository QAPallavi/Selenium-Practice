import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage {
	
	public static void main(String[] args) {
		
		//Create Driver Object for Chrome Browser
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(baseUrl);
		
	    //Click on the logo
		driver.findElement(By.cssSelector("a[title='Go to Facebook home'] > .fb_logo.img.sp_33iNLw2SSTv.sx_f51271")).click();
		
		//Verify Page
		if (driver.getTitle().equals("Facebook - log in or sign up")) {
			System.out.println("We are back at Facebook's homepage");
		}
		else {
			System.out.println("Some other page..");
		}
		driver.quit();
	}
}
