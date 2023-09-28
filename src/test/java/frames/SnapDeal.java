package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.snapdeal.com/");
	WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
	Actions a = new Actions(driver);
	a.moveToElement(signIn).perform();
	driver.findElement(By.xpath("//a[text()='login']")).click();
	
	//we can identiy id by writing iframe in finder(ctr+f)
	//switch control to frame
	driver.switchTo().frame(0);
	Thread.sleep(7000);
	//WebElement mobile = driver.findElement(By.name("username"));
	//mobile.sendKeys("sassi");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@id='close-pop']")).click();
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("inputValEnter")).sendKeys("phone");
}
}
