import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataExcel {
	
	// to read data we use fileinputstream java method
	//ExcelFile-->workbook-->sheets-->rows-->cells

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\TestData\\homes.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("Sheet2");
        int totalrows=sheet.getLastRowNum();
        int totalcells=sheet.getRow(1).getLastCellNum();
        
        System.out.println("total no of rows:" + totalrows);  // in excel rows start from zero(0)
        System.out.println("Total no of cells: "+ totalcells); // but cells count starts from 1 so in nested loop we use <
        
        for(int r=0;r<=totalrows;r++)
        {
        XSSFRow	currentrow=sheet.getRow(r);
        	for(int c=0;c<totalcells;c++) {
        		XSSFCell cell=currentrow.getCell(c); //we are getting cell data
        		System.out.print(cell.toString() + "\t");// inorder to read data we use toString method
        	}
        	System.out.println("   ");
        }
        
        workbook.close();
        file.close();
	}

}
