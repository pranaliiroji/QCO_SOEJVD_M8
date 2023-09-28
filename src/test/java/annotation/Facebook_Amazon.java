package annotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Amazon {
	WebDriver driver;
@Test
public void Amazon()
{
	driver.get("https://www.amazon.in");
}
@Test
public void facebook()
{
	driver.get("https://www.facebook.com");
	}
@BeforeMethod
public void basic_steps()
{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
@AfterMethod
public void closing() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
}

}
