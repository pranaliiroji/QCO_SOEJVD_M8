package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Driven {
public static void main(String[] args) throws IOException, InterruptedException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
	
	p.load(fis);
	 String urlapp = p.getProperty("url");
	 String user=p.getProperty("username");
	 String pass=p.getProperty("password");
	 WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(urlapp);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(2000);
		driver.close();
}
}
