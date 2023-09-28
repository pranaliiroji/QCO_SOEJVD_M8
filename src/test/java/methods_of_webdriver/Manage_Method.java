package methods_of_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manage_Method {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	
	//maximize the browser
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	
	//fullscreen
	driver.manage().window().fullscreen();
}
}
