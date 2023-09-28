package methods_of_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Quit_Method {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://omayo.blogspot.com/");
	
	//identify open a popup window link
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	
	Thread.sleep(2000);
	
	//use to close parent browser
	//driver.close();
	
	//use to close both parent as well as child browser
	driver.quit();
}
}
