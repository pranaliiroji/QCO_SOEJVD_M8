package TestNg_Sequencial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser {
	@Parameters({"browsername"})
	@Test
	public void fb(String browser)
	{
		WebDriver driver;
		if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\wcsa6workspace\\QCO_SOEJVD_M8\\src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
	}
}
