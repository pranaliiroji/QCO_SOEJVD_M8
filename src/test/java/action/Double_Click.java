package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	WebElement plus = driver.findElement(By.id("add"));
	Actions a = new Actions(driver);
	a.doubleClick(plus).perform();
	driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
	Thread.sleep(2000);
	
	//handling conirmation popup
	Alert a1 = driver.switchTo().alert();
	a1.accept();
	}
}
