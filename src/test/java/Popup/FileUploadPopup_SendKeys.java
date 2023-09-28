package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup_SendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.foundit.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
	driver.findElement(By.id("file-upload")).sendKeys("D:\\Pranali_Iroji.pdf");
	Thread.sleep(2000);
	driver.close();

}
}
