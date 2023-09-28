package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Create_a_Account {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=	new EdgeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("pranali");
		driver.findElement(By.name("lastname")).sendKeys("iroji");
		driver.findElement(By.name("reg_email__")).sendKeys("pranaliiroji@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("123456");
		driver.findElement(By.id("password_step_input")).sendKeys("123456");
		driver.findElement(By.name("birthday_day")).click();
		driver.findElement(By.xpath("(//option[@value='8'])[1]")).click();
		driver.findElement(By.name("birthday_month")).click();
		driver.findElement(By.xpath("(//option[@value='11'])[2]")).click();
		driver.findElement(By.name("birthday_year")).click();
		driver.findElement(By.xpath("//option[@value='2020']")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
