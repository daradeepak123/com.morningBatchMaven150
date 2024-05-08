package pageObjectsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericUtil.GenricMethods;

public class DashBoardPage extends GenricMethods{
	
	
	By dashBoardTab=By.xpath("//span[text()='Dashboard']");
	By assignLeaveLink=By.xpath("//span[text()='Dashboard']");
	
	public void dashBoardLink(WebDriver driver)
	{
		clickWebElement(dashBoardTab, driver);
	}
	public void assignLeaveeleLink(WebDriver driver)
	{
		clickWebElement(assignLeaveLink, driver);
	}
	

}
