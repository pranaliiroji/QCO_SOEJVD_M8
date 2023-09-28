package basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver manage statement
		WebDriverManager.edgedriver().setup();
		
		//upcasting statement
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//to launch web application
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		//driver.quit();
	}

}
