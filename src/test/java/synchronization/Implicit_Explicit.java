package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Explicit {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	
	//upcasting statement
	WebDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	
	//to launch web application
	driver.get("https://www.facebook.com");
	
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement email = driver.findElement(By.id("email"));
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(email));
	email.sendKeys("admin");
	
	WebElement loginbutton = driver.findElement(By.name("login"));
	wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
	loginbutton.click();
	
	driver.close();
	
}
}
