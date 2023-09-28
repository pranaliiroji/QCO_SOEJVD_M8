package methods_of_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Method {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	  WebDriver driver=	new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com");
	  
	  driver.navigate().to("https://www.bluestone.com");
	  //driver.findElement(By.xpath("//span[text()='Not now']")).click();
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
	  driver.close();
}
}
