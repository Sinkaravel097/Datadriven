package org.executable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatas {

	public static void main(String[] args) throws IOException {

		File f = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Excel_DataDriven.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook w = new XSSFWorkbook(fis);

		XSSFSheet sheet = w.getSheetAt(0);

		String value = " ";

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				XSSFCell cells = row.getCell(j);

				int cell1 = cells.getCellType();

				if (cell1 == 1) {

					value = cells.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(cells)) {

					Date date = cells.getDateCellValue();

					SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");

					value = s.format(date);

				} else {

					double dd = cells.getNumericCellValue();
					long l = (long) dd;
					value = String.valueOf(l);

				}

				System.out.println(value);
			}

		}

	
		

	}

}
