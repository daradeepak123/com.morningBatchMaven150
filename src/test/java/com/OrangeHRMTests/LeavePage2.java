package com.OrangeHRMTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import genericUtil.BrowserChoice;
import genericUtil.ExcelUtil;
import genericUtil.GenricMethods;
import pageObjectsClasses.LoginPage;

public class LeavePage2 extends GenricMethods{
	
	static XSSFSheet sheet;
	static WebDriver driver;
	static String url;
	static BrowserChoice bc;
	static ExcelUtil ec;
	String path="c:\\demo\\employee.xlsx";
	LoginPage lp=new LoginPage();
	@BeforeClass
	public void bClass() throws Exception
	{
		ExcelUtil ec=new ExcelUtil();
		
		sheet=ec.returnAllSheetData(path,"Sheet2");
		bc=new BrowserChoice();
		driver=bc.brwChoice(driver);
		
		url=sheet.getRow(3).getCell(0).toString();
		driver.get(url);
		String creds[]=new String[2];
		creds[0]=sheet.getRow(0).getCell(0).toString();
		creds[1]=sheet.getRow(0).getCell(1).toString();
		lp.login(driver, creds[0], creds[1]);
				
	}

	
	@BeforeMethod
	public void bMethod()
	{
		WebElement dBoard=driver.findElement(By.xpath("//span[text()='Leave']"));
		
		clickWebElement(dBoard, driver);
	}
	
	@Test
	public void AssignLeave()
	{
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Apply']"));
		clickWebElement(ele, driver);
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void leaveList()
	{
		WebElement ele=driver.findElement(By.xpath("//a[text()='My Leave']"));
		clickWebElement(ele, driver);
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void timeSheet()
	{
		WebElement ele=driver.findElement(By.xpath("//a[text()='Leave List']"));
		clickWebElement(ele, driver);
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void applyLeave()
	{
		WebElement ele=driver.findElement(By.xpath("//a[text()='Assign Leave']"));
		clickWebElement(ele, driver);
		System.out.println(driver.getCurrentUrl());
	}
	
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Clean up activity");
	}
	
	

	@AfterTest
	public void aTest() throws IOException
	{
		//wb.close();
		driver.quit();
	}
	
	
	
	
}
