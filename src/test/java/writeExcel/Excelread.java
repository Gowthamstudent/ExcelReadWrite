package writeExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		
		FileInputStream fil = new FileInputStream("E:\\Eclipse_Work_Space\\ExcelReadWrite\\TestData\\TestData.xlsx");
		//File f = new File(fil)
		
		XSSFWorkbook wbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = wbook.getSheetAt(0);
		String sheetName = sheet.getSheetName();
		System.out.println(sheetName);
		
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
			int cellcount = sheet.getRow(0).getLastCellNum();
			
		
		
		
		Object[][] data = new Object[rowcount][cellcount];
		
		for(int i=0;i<rowcount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<cellcount;j++) {
				
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String formatCellValue = dft.formatCellValue(cell);
				
				data[i][j] = formatCellValue;
				
				System.out.println(formatCellValue);
				
			}
		}
		
		
		FileInputStream inputStream = new FileInputStream(new File("E:\\Eclipse_Work_Space\\ExcelReadWrite\\TestData"));
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet she = wb.createSheet("abi");
		XSSFRow row = she.createRow(rowcount);
		
		XSSFCell cell = row.createCell(cellcount);
		cell.setCellValue("Loosukoo");
		FileOutputStream fos = new FileOutputStream("E:\\Eclipse_Work_Space\\ExcelReadWrite\\TestData");
		wb.write(fos);
		wb.close();
		
		
	}

}
