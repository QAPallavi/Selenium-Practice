import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLWebTable {

	public static void main(String[] args) {
		
		//Create ChromeWebDriver Instance
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		driver.get(baseUrl);
		 
		String innerText = driver.findElement(By.xpath("//td[contains(text(),'fourth cell')]")).getText();
		System.out.println(innerText);
		 
		driver.quit();
	}

}
