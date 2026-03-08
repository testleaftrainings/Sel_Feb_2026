package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//Open the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		//identify the worksheet
		XSSFSheet ws = wb.getSheetAt(0);//index starts 0
		//identify the row
		String stringCellValue = ws.getRow(1).getCell(2).getStringCellValue();
		System.out.println(stringCellValue);
		//row header
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		//rowCount
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		//columnCount
		int columnCount = ws.getRow(2).getLastCellNum();
		System.out.println(columnCount);
		//entire data
		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
			}
			
		}
		wb.close();
	}

}
