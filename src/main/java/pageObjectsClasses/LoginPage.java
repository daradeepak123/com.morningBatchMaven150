package pageObjectsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import genericUtil.GenricMethods;

public class LoginPage extends GenricMethods{
	
	By userNameTB=By.xpath("//input[@name='username']");
	By passwordTB=By.xpath("//input[@name='password']");
	By loginBTN=By.xpath("//button");
	
	
	public void login(WebDriver driver, String Uname,String Pwd)
	{
		sendDataWebElement(userNameTB,driver,Uname);
		sendDataWebElement(passwordTB,driver,Pwd);
		clickWebElement(loginBTN,driver);
	}
	
	

}
