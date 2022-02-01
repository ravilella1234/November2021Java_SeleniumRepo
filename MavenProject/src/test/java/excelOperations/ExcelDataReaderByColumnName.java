package excelOperations;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReaderByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\ravi\\Desktop\\testdata1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell= null;
		
		int cellNum = 0;
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("UserName"))
			{
				cellNum = i;
			}
		}
		
		row = sheet.getRow(3);
		cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		wb.close();
		fis.close();
	}

}
