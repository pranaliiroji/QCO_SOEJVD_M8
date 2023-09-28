package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name{
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	//upcasting statement
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//to launch web application
	driver.get("https://www.facebook.com");
	
	//identify name textfield
	driver.findElement(By.name("email")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("admin@123");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	driver.close();
}
}
