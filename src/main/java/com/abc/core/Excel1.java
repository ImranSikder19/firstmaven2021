package com.abc.core;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public  class Excel1 {
	
public static void main(String[] args) throws IOException, InvalidFormatException {
	File file = new File("C:\\Users\\imran\\Desktop\\excel1.xlsx");
	//FileInputStream fis = new FileInputStream(file);
			
		XSSFWorkbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheet("imran");
	int totalrow = sheet.getLastRowNum()+1;
	int totalcell = sheet.getRow(0).getLastCellNum();
	
	for(int i =0;i<totalrow;i++) {
		for(int j =0;j<totalcell;j++) {
			
			String s =sheet.getRow(i).getCell(j).getStringCellValue();
			//System.out.print(total no of row and cell:+ s);

			System.out.println(s +"");
		}

	}

	System.out.println();
}

}	


