package amazonpage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,3000)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement web = driver.findElement(By.xpath("//a[text()='VIEW ALL COURSES']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(0,0)");
		//js1.executeScript("argument[0].scrollintoveiw()", web);
		//js1.executeScript("window.scrollTo(argument[0],argument[1])",web.getLocation().getX(),web.getLocation().getY());
		WebElement reg = driver.findElement(By.xpath("//a[text()='Register']"));
		
		String value = reg.getCssValue("background-color");
		String value1 = reg.getCssValue("color");
		//Color color = Color.fromString(value);
		System.out.println("Background Color :"+ value);
		System.out.println("Color :"+value1);
		
		int x = reg.getLocation().getX();
		int y = reg.getLocation().getY();
		System.out.println("X Value: " + x +  " ||  Y Value: " + y );
		
		
		

		driver.quit();
		

	}

}
