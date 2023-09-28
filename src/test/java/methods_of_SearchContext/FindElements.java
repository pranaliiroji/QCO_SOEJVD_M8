package methods_of_SearchContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("poha");
	List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	for(WebElement poha:allsuggestions)
	{
		
		System.out.println(poha.getText());
		Thread.sleep(2000);
	}
}
}
