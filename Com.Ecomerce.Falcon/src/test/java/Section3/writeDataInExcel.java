package Section3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeDataInExcel {
public void writeDataInExcel(String sheetName , int rowNum , int cellNum,
String value) throws Exception
{
	FileInputStream fis = new FileInputStream(IconstantUtility.excelpath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = cook.getSheet(sheetName);
	sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
	FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);
	book.write(fos);
}

}
