package TestNG_Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider {
@DataProvider
public Object[][] getData()
{
	Object[][] a=new Object[3][2];
	a[0][0]="pranali";
	a[0][1]="iroji";
	
	a[1][0]="java";
	a[1][1]="selenium";
	
	a[2][0]="hii";
	a[2][1]="hello";
	return a;
	}
@Test(dataProvider="getData")
public void demo(String username, String password) throws InterruptedException
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	Thread.sleep(2000);
	driver.close();
}
}
