package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_LoginPage {
	//Declaration
	//address of email textfield
	@FindBy(id="email")
	private WebElement emailtf;
	
	//address of password textfield
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passwordtf;
	
	//address of login button
	@FindBy(name="login")
	private WebElement loginBtn;
	
	//Initialization
	public Fb_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void emailTextField(String name)
	{
		emailtf.sendKeys(name);
	}
	
	public void passwordTextField(String name)
	{
		passwordtf.sendKeys(name);
	}
	
	public void loginButton()
	{
		loginBtn.click();
	}
	
	
}
