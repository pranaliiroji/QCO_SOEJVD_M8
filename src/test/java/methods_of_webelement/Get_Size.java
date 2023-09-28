package methods_of_webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Size {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://desktop-a58gs94/login.do");
	Dimension pass = driver.findElement(By.name("pwd")).getSize();
	int width = pass.getWidth();
	int height = pass.getHeight();
	System.out.println("Height = "+height+" width = "+width);
}
}
