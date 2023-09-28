package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		//upcasting statement
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//to launch web application
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("pranali");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("pran123");
		
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.close();
	}

}
