package select_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selection_Method_For_Single_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///D:/menudropdown.html");
		WebElement dropdown = driver.findElement(By.id("i1"));

		Select s = new Select(dropdown);
		
		//select by index
		s.selectByIndex(0);
		Thread.sleep(2000);
		
		//select by value
		s.selectByValue("v2");
		Thread.sleep(2000);
		
		//select by text
		s.selectByVisibleText("Puranpoli");
		
		driver.close();
	}

}
