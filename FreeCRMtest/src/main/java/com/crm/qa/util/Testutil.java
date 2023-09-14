package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.qa.base.TestBase;

public class Testutil extends TestBase {
	
	
	public static long PAGE_LOAD_TIMEOUT=20;
	
	public static long IMPLICITY_WAIT=20;	
	
	public static String TESTDATA_SHEET_PATH="/Users/macmini/Documents/Selenium new/selenium script"
			+ "/FreeCRMtest/src/main/java/com/crm/qa/Testdata/FreeCRMTestdata.xlsx";
	
	static Workbook book;
	static Sheet sheet;
	
	
	public void SwitchtoFrame() {
		
		driver.switchTo().frame("mainpanel");
		
	}
	
	public static Object[][] GetTestdata(String SheetName){
		FileInputStream file=null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		sheet=book.getSheet(SheetName);
		Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i=0; i< sheet.getLastRowNum(); i++) {
			for(int k=0;  k < sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		
		return data;
	}
	
	

}
