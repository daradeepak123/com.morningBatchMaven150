package genericUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GenricMethods {
	
	
	public static Logger log= LogManager.getLogger(GenricMethods.class);
	
	
	public String loadPropFilees(String path,String property) throws IOException
	{

		File file=new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties config=new Properties();
		config.load(fis);
		return config.getProperty(property);
	}
	
	public void clickWebElement(By loc,WebDriver driver)
	{
		WebElement ele=driver.findElement(loc);
		boolean bool=ele.isDisplayed();
		bool&=ele.isEnabled();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		if(bool)
		{
			try {
			ele.click();
			log.info("Succesfully clicked on webElement");
			}
			catch (ElementClickInterceptedException e) {
				log.error("failed to click on webelement");
				e.printStackTrace();
				
			}
		}
		else
		{
			System.out.println("element is not displayed/enabled");
		}
		
		
	}
	
	
	
	public void clickWebElement(WebElement ele,WebDriver driver)
	{
		
		boolean bool=ele.isDisplayed();
		bool&=ele.isEnabled();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		if(bool)
		{
			try {
			ele.click();
			log.info("Succesfully clicked on webElement");
			}
			catch (ElementClickInterceptedException e) {
				e.printStackTrace();
				log.error("failed clicked on webElement");
			}
		}
		else
		{
			System.out.println("element is not displayed/enabled");
		}
		
		
	}
	
	public void sendDataWebElement(WebElement ele,WebDriver driver,String data)
	{
		
		boolean bool=ele.isDisplayed();
		bool&=ele.isEnabled();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		if(bool)
		{
			try {
			ele.clear();
			log.info("cleared the data on text box");
			ele.sendKeys(data);
			}
			catch (ElementClickInterceptedException e) {
				e.printStackTrace();
				log.info("entered the data in text box");
			}
		}
		else
		{
			System.out.println("element is not displayed/enabled");
		}
		
	}
	
	public void sendDataWebElement(By loc,WebDriver driver,String data)
	{
		WebElement ele=driver.findElement(loc);
		boolean bool=ele.isDisplayed();
		bool&=ele.isEnabled();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		if(bool)
		{
			try {
			ele.clear();
			ele.sendKeys(data);
			}
			catch (ElementClickInterceptedException e) {
				e.printStackTrace();
				
			}
		}
		else
		{
			System.out.println("element is not displayed/enabled");
		}
	}
	
	

}
