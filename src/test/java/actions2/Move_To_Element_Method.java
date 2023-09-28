package actions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Move_To_Element_Method {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		WebElement watchJewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions a = new Actions(driver);
		a.moveToElement(watchJewellery).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Charm']")).click();
		driver.close();
	}

}
