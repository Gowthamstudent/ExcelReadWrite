package amazonpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	@Test
	public void login() {
		try {
			 driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			WebElement user = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
			
			
			
			
			
			
		}
		finally {
			driver.quit();
		}
		
		
	}
	

}
