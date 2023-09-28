package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethod {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	
	//launch the browser
	WebDriver driver=new FirefoxDriver();
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//used to launch instagram
	driver.get("https://www.instagram.com");
	
	
}
}
