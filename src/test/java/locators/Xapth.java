package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xapth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
		
		//upcasting statement
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//to launch web application
		driver.get("https://www.facebook.com");
		//by using attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		
		//by using contains()
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("admin123");
		
		//by using text()
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//by using contains 
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	}

}
