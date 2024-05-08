package basic;

import org.testng.annotations.Test;

public class TestNGScript {

	
	@Test(enabled=true,priority = 1)
	public void hellloTest2()
	{
		System.out.println("test ng pattern");
	}
	
	@Test(enabled=true,priority = 2)
	public void hellloTest()
	{
		System.out.println("test ng pattern");
	}
	
	
	@Test(invocationCount = 3,description = "just printing data",priority = 3,dependsOnMethods = "hellloTest")
	public void hellloTest1()
	{
		System.out.println("test ng pattern");
	}
	
	
	
	
	
}

