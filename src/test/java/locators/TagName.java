package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {

	public static void main(String[] args) {
		
		//fetch all the link webelement name in a console
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.facebook.com/");
		
		//to identify all links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement singleLink:allLinks)
		{
			System.out.println(singleLink.getText());
		}
	}

}
