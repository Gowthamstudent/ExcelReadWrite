package writeExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_webtable_to_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/descendant::tr"));
		
		XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Web Table Data");
        
        for (int i = 0; i < rows.size(); i++) {
            XSSFRow excelRow = sheet.createRow(i);
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));

            for (int j = 0; j < cells.size(); j++) {
                String cellText = cells.get(j).getText();
                excelRow.createCell(j).setCellValue(cellText);
            }
        }
         FileOutputStream fileOut = new FileOutputStream("WebTableData12.xlsx");
         workbook.write(fileOut);
        
        workbook.close();
        driver.quit();

        System.out.println("Data copied from web table to Excel successfully!");
	}

}
