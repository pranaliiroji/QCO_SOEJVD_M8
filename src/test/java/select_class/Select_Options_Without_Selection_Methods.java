package select_class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Options_Without_Selection_Methods {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("file:///D:/menudropdownmultiselect.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	Select s = new Select(dropdown);
	List<WebElement> value = s.getOptions();
	for(int i=0;i<value.size();i++)
	{
		if(value.get(i).getText().equals("Vadapav"))
		{
			value.get(i).click();
		}
	}
}
}
