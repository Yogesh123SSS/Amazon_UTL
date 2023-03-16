package com.amazon.orgname.genericutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * This method is for reading the string data from excel file
	 * @author Yogesh K U
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @throws FileNotFoundException
	 * 
	 */
	public String readStringDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException, FileNotFoundException {
		FileInputStream fis = new FileInputStream("./src/test/resources/AmazonTestData.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		String celldata = workBook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return celldata;
	}
	/**
	 * @author Yogesh K U
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return double
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public int readIntDataFromExcl(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/AmazonTestData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		double celldata=workbook.getSheet(sheetName).getRow(row).getCell(cell).getNumericCellValue();
		return (int)celldata;
	}
}
