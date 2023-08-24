package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args)throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\ELMUR10\\eclipse-workspace\\PPSISample\\testdata\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int numsheet=workbook.getNumberOfSheets();
		XSSFSheet sheet = null;
		for(int i=0;i<numsheet;i++)
		{
			if(workbook.getSheetName(i).equals("data1"))
				{
				sheet=workbook.getSheetAt(i);
				}
		}
		Iterator<Row> itrow=sheet.rowIterator();
		while(itrow.hasNext())
		{
		Row row=itrow.next();
		Iterator itcell=row.cellIterator();
		Cell c=(Cell) itcell.next();
		if(c.getStringCellValue().equals("Global"))
		while(itcell.hasNext())
		{
			
			
			c=(Cell) itcell.next();
			System.out.println(c.getStringCellValue());
		}
		}
	}
}
