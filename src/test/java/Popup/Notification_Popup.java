package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {
public static void main(String[] args) {
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\wcsa6workspace\\QCO_SOEJVD_M8\\src\\main\\resources");
    WebDriver driver=new ChromeDriver(co);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    driver.get("https://www.quikr.com/bangalore");
}
}
