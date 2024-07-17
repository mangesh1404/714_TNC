package com.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class ExcelWrite {

	public static Sheet sh= null;
	public static Row r=null;
	public static Cell c = null;
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		if(wb.getSheet("Test")==null) {
			sh= wb.createSheet("Test");
			r= sh.createRow(3);
		}
		else {
			sh= wb.getSheet("Test");
			if(sh.getRow(3)==null)
				r= sh.createRow(3);
			else
				r=sh.getRow(3);	
			}
		c=r.createCell(5);	
		c.setCellValue("TheKiranAcademy");
		FileOutputStream fos = new FileOutputStream("TestData.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
	}
	
}
