package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_Alert {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("Selenium Training")).click();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Alert ok = driver.switchTo().alert();
		System.out.println(ok.getText());
		ok.accept();
		//ok.dismiss();
		driver.close();
		
	}

}
