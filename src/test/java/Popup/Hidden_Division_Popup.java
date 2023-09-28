package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_Division_Popup {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//span[text()='Date']")).click();
	driver.findElement(By.xpath("//div[text()='Sep']/../../..//span[text()='21']")).click();
	driver.close();
}
}
