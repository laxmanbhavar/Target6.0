package Frame_work1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	
	public static String readexcel(int row,int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\bhava\\Documents\\readexdata\\parameterizationexedata.xlsx");
		Sheet sht = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = sht.getRow(row).getCell(col).getStringCellValue();
		System.out.println(data);
		return data;
		
		
	}

}
