package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell {
	
	public static String readData(String sheetName,int rowNum,int cellNum)
	{
		try
		{
	 FileInputStream fis = new FileInputStream("C:\\Users\\vidagots\\eclipse-workspace\\Amazon\\1.xlsx");
	 Workbook w1= WorkbookFactory.create(fis);
	 System.out.println("workbook");
	 String data= w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	 return data;
		}
		catch(Exception rv)
		{
			System.out.println("exeption occured in read");
			return "";
		}
	}
	public static void writeData(String sheetName,int rowNum,int cellNum,String data)
	{
		try
		{
	 FileInputStream fis = new FileInputStream("C:\\Users\\vidagots\\eclipse-workspace\\Amazon\\1.xlsx");
	 Workbook w1= WorkbookFactory.create(fis);
	 System.out.println("workbook1");
	 w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
	 FileOutputStream fos = new FileOutputStream("C:\\Users\\vidagots\\eclipse-workspace\\Amazon\\1.xlsx");
			 w1.write(fos);
		}
	 catch(Exception rv)
	 {
		 System.out.println("exception occured in write");
	 }
	}

}
