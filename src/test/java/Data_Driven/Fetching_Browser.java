package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetching_Browser {

	public static void main(String[] args) throws Throwable {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		p.load(fis);
		 String urlapp = p.getProperty("url");
		 String user=p.getProperty("username");
		 String pass=p.getProperty("password");
		 String browser=p.getProperty("browser");
		 WebDriver driver;
		 if(browser.equals("edge"))
		 {
			 driver=new EdgeDriver();
		 }
		 else
		 {
			 driver=new FirefoxDriver();
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(urlapp);
		 driver.findElement(By.id("email")).sendKeys(user);
		 driver.findElement(By.id("pass")).sendKeys(pass);

	}

}
