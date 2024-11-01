package writeExcel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exceride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	
		//Actions action = new Actions(driver);
		
		//JavascriptExecutor js = (JavascriptExecutor)driver; 
		//js.executeScript("window.scrollTo(0,document.body.scrollheight)");
		
		List<WebElement> web = driver.findElements(By.xpath("//div[@id='navFooter']/descendant::div[text()='Make Money with Us']/following-sibling::ul//li"));
		
		for(WebElement we:web) {
			
			String text = we.getText();
			System.out.println(text);
			
			
		}
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		//WebElement accesories = driver.findElement(By.xpath("//div[@id='nav-subnav']/child::a/span[contains(text(), 'Mobiles')]"));
		//action.moveToElement(accesories).perform();
		//WebElement mid = driver.findElement(By.xpath("//div[@class='mega-menu']//descendant::h3[text()='Mobile brands']/parent::div//li/child::a[text()='Mi']"));
		//action.moveToElement(mid).click().build().perform();
		
		//String text = mid.getText();
		//List<WebElement> findElements = driver.findElements(By.xpath(""));
		

	}

}
