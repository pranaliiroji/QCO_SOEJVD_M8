package select_class;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.internal.Options;

public class Remove_Duplicate_Options_TreeSet {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("file:///D:/menudropdownmultiselect.html");
	WebElement dropdown = driver.findElement(By.name("menu"));
	TreeSet<String> t = new TreeSet<String>();
	Select s = new Select(dropdown);
	List<WebElement> options = s.getOptions();
	for(int i=0;i<options.size();i++)
	{
		String opt = options.get(i).getText();
		t.add(opt);
	}
	for(String v:t)
	{
		System.out.println(v);
		Thread.sleep(2000);
	}
}
}
