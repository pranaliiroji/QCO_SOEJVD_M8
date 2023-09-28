package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(block1, block4).perform();
		driver.close();
	}

}
