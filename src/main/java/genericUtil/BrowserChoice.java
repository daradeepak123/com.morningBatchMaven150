package genericUtil;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserChoice {
	
	
	public WebDriver brwChoice(WebDriver driver) throws IOException
	{
		
		GenricMethods gm=new GenricMethods();
		String browser=gm.loadPropFilees(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties", "browser");
		
		
		
		if(browser.equals("ff"))
		{
		driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
		driver=new EdgeDriver();
		}
		else if(browser.equals("ie"))
		{
		driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		return driver;
	}
	

}
