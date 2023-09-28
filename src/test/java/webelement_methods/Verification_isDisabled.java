package webelement_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_isDisabled {

	public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=	new EdgeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	WebElement email = driver.findElement(By.id("email"));
	if(email.isDisplayed())
	{
		email.sendKeys("pranali");
		System.out.println("Hii if block");
	}
	else
	{
		System.out.println("Hii else block");
	}
	}
}
