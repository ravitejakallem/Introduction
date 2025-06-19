import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataExcelusingLoops {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\testing.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows ?:");
		int noofrows=sc.nextInt();
		
		System.out.println("How many cells?:");
		int noofcells=sc.nextInt();
		
		for(int r=0;r<=noofrows;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<noofcells;c++)
			{
		       XSSFCell cell=currentrow.createCell(c);
		       cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(fos);
		workbook.close();
		fos.close();
		System.out.println("File is created: ");
		


	}

}
