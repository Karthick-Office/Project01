package com.TestNg.DataDrivenTest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteDatainExcel {
	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();
			
			XSSFSheet sheetone = workbook.createSheet("mysheet");
            Object [][] data = {{"Name","Location"},
					            {"Karthick","Salem"},
					            {"Sitheswaran","Salem"},
					            {"Gunasekaran","Salem"}};
			
			int rows = data.length;
			int columns = data[0].length;
			
			for(int r=0;r<rows;r++)
				
			{
			  XSSFRow row=  sheetone.createRow(r); 
			for(int c=0;c<columns;c++)	{
				
				XSSFCell cell = row.createCell(c);
				
				        Object cellValue   = data[r][c];
				        
				        cell.setCellValue((String)cellValue);
			}
			
			}
			String excelpath = "C:\\Users\\karth\\eclipse-workspace\\Selenium-Learn\\src\\test\\resources\\Employees.xlsx";
			File excelfile = new File(excelpath);
			FileOutputStream fos = new FileOutputStream(excelfile);
			workbook.write(fos);
			workbook.close();
			System.out.println("Task Completed");
			
			
			}
			
		}
