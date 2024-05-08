package genericUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFileLearn {
	
	
	@Test
	public void readData() throws IOException
	{
		File file=new File(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		System.out.println(System.getProperty("user.dir"));
		
		FileInputStream fis=new FileInputStream(file);
		
		Properties config=new Properties();
		config.load(fis);
		
		System.out.println(config.getProperty("url"));
		
	}
	
	

}
