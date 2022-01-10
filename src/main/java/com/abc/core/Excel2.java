package com.abc.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {
	XSSFWorkbook workbook =null;
	
	public Excel2() throws InvalidFormatException, IOException {
		File file =new File(System.getProperty("C:\\Users\\imran\\eclipse-workspace\\firstmavenProject\\src\\excel3\\Data.xlsx"));
	FileInputStream fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
	
	}
	public String[][]getDataProvider(){
		Sheet sheet = workbook.getSheet("imran1");
		int numofrow =sheet.getLastRowNum()+1;
		int numofcell =sheet.getRow(0).getLastCellNum();
		String data[][]= new String[numofrow][numofcell];
		for(int i =0;i<numofrow;i++) {
			for(int j=0;j<numofcell;j++ ) {
				try {
					data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();				
			}catch(Throwable e) {
				data[i][j]="";
			}
		}
	}
		return data;
	}
}
	
	
	
	

