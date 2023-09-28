package auto_suggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Computer_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("vadapav");
		Thread.sleep(7000);
		List<WebElement> values = driver.findElements(By.className("wM6W7d"));
		Thread.sleep(7000);
		System.out.println(values.size());
		Thread.sleep(7000);
		for(WebElement v:values)
		{
			Thread.sleep(6000);
			System.out.println(v.getText());
		}
		driver.close();

	}

}
