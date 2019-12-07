
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCookies {
	
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PALLAVI\\ChromeDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //Launching IssueWire for testing
	    driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
	    
	    //Input Email id and Password 
	    driver.findElement(By.name("username")).sendKeys("pallavi@elphilltechnology.com");							
	    driver.findElement(By.name("password")).sendKeys("pallavi");							
	    driver.findElement(By.name("submit")).click();		
	    
	    Thread.sleep(3000);
	    
	    // create file named Cookies to store Login Information		
	    File file = new File("Cookies.data");
	    
	    try		
	    {	  
	        //Delete old file if exists
			file.delete();		
	        file.createNewFile();			
	        FileWriter fileWrite = new FileWriter(file);							
	        BufferedWriter Bwrite = new BufferedWriter(fileWrite);	
	        
	        //Loop for getting the cookie information 			
	        for(Cookie ck : driver.manage().getCookies())							
	        {			
	        	String writeup = ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure();
	        	Bwrite.write(writeup);
	            System.out.println(writeup);
	            Bwrite.newLine();             
	        }	
	        
	        Bwrite.close();			
	        fileWrite.close();	
	        }
	    
	    catch(Exception ex)					
	        {		
	           ex.printStackTrace();			
	        }		
	 
	    Thread.sleep(3000);
	    
	    driver.close();
	    } 

}
