package writeExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_excel_to_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileInputStream sourceFile = new FileInputStream(new File("E:\\Eclipse_Work_Space\\practice_excel_database\\test_data\\lee.xlsx"));
		FileInputStream sourceFile = new FileInputStream(new File("E:\\Eclipse_Work_Space\\practice_excel_database\\test_data\\TestData.xlsx"));
		
        XSSFWorkbook sourceWorkbook = new XSSFWorkbook(sourceFile);
        XSSFSheet sourceSheet = sourceWorkbook.getSheetAt(0);
        
        FileOutputStream targetFile = new FileOutputStream(new File("target.xlsx"));
        XSSFWorkbook targetWorkbook = new XSSFWorkbook();
        XSSFSheet targetSheet = targetWorkbook.createSheet("Sheet1");
        for (int i = 0; i <= sourceSheet.getLastRowNum(); i++) {
            XSSFRow sourceRow = sourceSheet.getRow(i);
            XSSFRow targetRow = targetSheet.createRow(i);

            if (sourceRow != null) {
                for (int j = 0; j < sourceRow.getLastCellNum(); j++) {
                    XSSFCell sourceCell = sourceRow.getCell(j);
                    XSSFCell targetCell = targetRow.createCell(j);

                    if (sourceCell != null) {
                        switch (sourceCell.getCellType()) {
                            case STRING:
                                targetCell.setCellValue(sourceCell.getStringCellValue());
                                break;
                            case NUMERIC:
                                targetCell.setCellValue(sourceCell.getNumericCellValue());
                                break;
                            case BOOLEAN:
                                targetCell.setCellValue(sourceCell.getBooleanCellValue());
                                break;
                            case FORMULA:
                                targetCell.setCellFormula(sourceCell.getCellFormula());
                                break;
                            default:
                                targetCell.setCellValue(sourceCell.getStringCellValue());
                                break;
                        }
                    }
                }
            }
        }
	
        targetWorkbook.write(targetFile);

        // Close resources
        targetFile.close();
        sourceWorkbook.close();
        sourceFile.close();
        targetWorkbook.close();
        
        System.out.println("Data copied successfully!");
	
	}

}
