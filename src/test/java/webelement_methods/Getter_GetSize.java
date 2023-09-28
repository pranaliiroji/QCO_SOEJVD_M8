package webelement_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getter_GetSize {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		  WebDriver driver=	new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com");
		  WebElement email = driver.findElement(By.id("email"));
		  
		  //to get height and width of emailtextfield
		  Dimension size = email.getSize();
		  int width = size.getWidth();
		  int height = size.getHeight();
		  System.out.println("Width = "+width);
		  System.out.println("Height = "+height);
	}

}
