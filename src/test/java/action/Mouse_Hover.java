package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://snapdeal.com/");
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("login")).click();
		driver.close();
	}

}
