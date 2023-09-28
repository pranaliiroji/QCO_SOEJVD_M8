package select_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllSelectedOptions {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("file:///D:/menudropdownmultiselect.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select s = new Select(dropdown);
	for(int i=0;i<=4;i++)
	{
		s.selectByIndex(i);
		Thread.sleep(2000);
	}
	List<WebElement> values = s.getAllSelectedOptions();
	for(WebElement v1:values)
	{
		System.out.println(v1.getText());
		Thread.sleep(2000);
	}
	driver.close();
}
}
