package genericUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	
	public XSSFSheet returnAllSheetData(String path,String sheetName) throws Exception
	{
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		return sheet;
		
	}
	
	
	
	
	

}
