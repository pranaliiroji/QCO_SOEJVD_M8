package methods_of_webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleMethod {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
  WebDriver driver=	new EdgeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("https://www.facebook.com");
  System.out.println(driver.getTitle());
}
}
