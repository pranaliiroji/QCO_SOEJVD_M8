package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Upload_Robot {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	
	//create a object of Robot class
	Robot r=new Robot();
	StringSelection str=new StringSelection("D:\\Pranali_Iroji.pdf");
	
	//used to copy the text Toolkit is from java
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	driver.close();
	
	
}
}
