package scrolling_action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_Using_GetLocation {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.com/");
	WebElement career = driver.findElement(By.linkText("Careers"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Point coordinates = career.getLocation();
	int x = coordinates.getX();
	int y = coordinates.getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	career.click();
	driver.close();
	
}
}
