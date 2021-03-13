package com.apache;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	public  static void main(String[] args) {
		
		get_row() ;
	}

	static XSSFWorkbook workbook;
	public static void get_row()  {

		
		try {
			String projectpath=System.getProperty("user.dir");
			
			workbook = new XSSFWorkbook(projectpath+"\\Excel\\data.xlsx");

			XSSFSheet sheet=workbook.getSheet("Sheet1");
			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("Total number of row count:"+rowcount);

		} catch (IOException e) {
			e.printStackTrace();;
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}
}