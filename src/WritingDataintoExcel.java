import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataintoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		XSSFRow row0=sheet.createRow(0);
		row0.createCell(0).setCellValue("python");
		row0.createCell(1).setCellValue("2");
		row0.createCell(2).setCellValue("welcome");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue("1");
		row1.createCell(2).setCellValue("welcome1");
		
		XSSFRow row2=sheet.createRow(0);
		row2.createCell(0).setCellValue("c langauge");
		row2.createCell(1).setCellValue(1);
		row2.createCell(2).setCellValue("welcome9");
		
		workbook.write(fos);

		workbook.close();
		fos.close();
	}
	

}
