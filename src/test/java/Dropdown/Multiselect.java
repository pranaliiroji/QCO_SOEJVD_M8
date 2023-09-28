package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demoapp.skillrary.com/");
	WebElement dropdown = driver.findElement(By.id("cars"));
	Select s = new Select(dropdown);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByValue("199");
	Thread.sleep(2000);
	//s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
	Thread.sleep(2000);
	System.out.println(s.isMultiple());
	List<WebElement> options = s.getAllSelectedOptions();
	for(WebElement opt:options)
	{
		System.out.println(opt.getText());
		Thread.sleep(2000);
	}
	s.deselectAll();
}
}
