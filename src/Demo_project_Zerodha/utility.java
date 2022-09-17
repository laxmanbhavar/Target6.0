package Demo_project_Zerodha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility { 
	
	public static void takesscrenshot(WebDriver driver) throws IOException {
		 Date d = new Date();
		 String str = d.toString(); // convert integer into string
		 str= str.replace(" ", "_");
		 str=str.replace(":","_");
		 
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File f = new File("D:\\screenshot\\New folder"+str+".jpg");
		  FileHandler.copy(source,f);
	}
	public static String readexcldata(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\bhava\\OneDrive\\Documents\\parameterizationexedata.xlsx");
		Sheet sht = WorkbookFactory.create(file).getSheet("Sheet1");
		            String data = sht.getRow(row).getCell(col).getStringCellValue();
		            System.out.println(data);
		            return data;
	}

}
