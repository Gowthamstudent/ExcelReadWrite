package amazonpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvExcercise {

	
	@Test (dataProvider = "datac", groups = {"smoke","regression"}) 
	public void automate(String data) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExceptedCond)
				Thread.sleep(2000);
		WebElement TestBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		TestBox.sendKeys(data + Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test (dataProvider = "datac", groups = "smoke")
	public void automate1(String data) throws InterruptedException {
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExceptedCond)
				Thread.sleep(2000);
		WebElement TestBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		TestBox.sendKeys(data + Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test (dataProvider = "datac", groups = "sanity")
	public void automate2(String data) throws InterruptedException {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExceptedCond)
				Thread.sleep(2000);
		WebElement TestBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		TestBox.sendKeys(data + Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
	@DataProvider(name="datac")
	public Object[][] datpack() {
		
		
		//Object[][] data = new Object[3][1];
		Object[][] data = new Object[1][1];
		data[0][0] = "Shoes";
				//data[1][0]= "Laptop";
						//data[2][0]= "leela";
						
						return data;
		
		
		
		
	}
}
