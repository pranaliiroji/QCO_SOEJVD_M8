package webelement_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=	new EdgeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("pranali");
		driver.findElement(By.name("pass")).sendKeys("pranali");
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		if(btn.isEnabled())
		{
			System.out.println("Entered into if block");
			btn.click();
		}
		else
		{
			System.out.println("Entered into else block");
		}
	}

}
