package org.executable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumOfRowsAndCells {

	public static void main(String[] args) throws IOException {

		File f = new File("E:\\Selenium Practical\\DataDriven\\Excel\\Excel_DataDriven.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook w = new XSSFWorkbook(fis);

		XSSFSheet sheet = w.getSheetAt(0);

		int row = sheet.getPhysicalNumberOfRows();

		System.out.println("No of Rows in Excel: " + row);

		XSSFRow r = sheet.getRow(0);

		int cells = r.getPhysicalNumberOfCells();

		System.out.println("No of Cells in Excel: " + cells);

	

	}

}
