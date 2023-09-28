package TestNG_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import static org.testng.AssertJUnit.assertequals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert {
	WebDriver driver;
@Test
public void Facebook()
{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	String title = driver.getTitle();
	//HardAssert
	//Assert.assertEquals(title,"pranali");
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(title,"pranali");
	System.out.println(title);
}

//private static void assertEquals(String title, String string) {


public void close()
{
	driver.close();
}
}
