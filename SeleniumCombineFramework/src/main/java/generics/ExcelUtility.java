package generics;

import java.io.File;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Row;

public class ExcelUtility implements IAutoConstants  {

	@DataProvider(name ="testdata")
	/**
	 * this method is used to read the data from Excel Sheet
	 * @return
	 * @throws Exception
	 */
	public static Object[][] readingMultipleData(ITestContext context) throws Exception {
		String sheetname=context.getCurrentXmlTest().getParameter("sheet")	;		
				File file = new File(EXCELPATH);
			Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheet(sheetname);
			int rowcount = sheet.getPhysicalNumberOfRows();
			int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] data = new Object[rowcount][cellcount];
			for (int row = 0; row < rowcount; row++) {
				Row actRow = sheet.getRow(row);
				for (int cell = 0; cell < actRow.getPhysicalNumberOfCells(); cell++) {
					data[row][cell] = actRow.getCell(cell).toString();
				}
			}
			return data;
		} 
	}
