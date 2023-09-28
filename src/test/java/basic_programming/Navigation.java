package basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
public static void main(String[] args) throws InterruptedException {
	//driver manage statement
			WebDriverManager.edgedriver().setup();
			
			//upcasting statement
			WebDriver driver=new EdgeDriver();
			
			driver.manage().window().maximize();
			
			//to launch web application
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			//Navigation from one url to another url
			driver.navigate().to("https://www.amazon.com");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.close();
}
}
