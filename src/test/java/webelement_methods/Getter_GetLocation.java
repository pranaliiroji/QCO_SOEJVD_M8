package webelement_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_GetLocation {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		  WebDriver driver=	new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com");
		  WebElement email = driver.findElement(By.id("email"));
		  Point loc = email.getLocation();
		  int xaxix = loc.getX();
		  int yaxix = loc.getY();
		  System.out.println("x axex is : " + xaxix + " y axex is : "+ yaxix);

	}

}
