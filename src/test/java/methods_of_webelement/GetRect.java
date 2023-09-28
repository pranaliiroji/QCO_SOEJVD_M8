package methods_of_webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRect {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://desktop-a58gs94/login.do");
	Rectangle login = driver.findElement(By.linkText("Login")).getRect();
	int x = login.getX();
	int y = login.getY();
	int w = login.getWidth();
	int h = login.getHeight();
	System.out.println("Height = "+h+" width = "+w);
	System.out.println("xaxes = "+x+" yaxes = "+y);

}
}
