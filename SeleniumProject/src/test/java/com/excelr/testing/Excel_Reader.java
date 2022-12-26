package com.excelr.testing;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excel_Reader {
	@DataProvider(name="loginData")
	public String[][] getData () throws IOException{
	File filePath=new File("./src/test/java/com/excelr/testing/Book1.xlsx");
	FileInputStream fis=new FileInputStream(filePath);
    XSSFWorkbook workbook=new XSSFWorkbook (fis);
    XSSFSheet sheet=workbook.getSheet("FBLogin");
    int noOfRows=sheet.getPhysicalNumberOfRows();
    int noOfColumns=sheet.getRow(0).getLastCellNum();
    
    String[][] data=new String[noOfRows][noOfColumns];
    for(int i=0;i<noOfRows;i++)
    {
    	for(int j=0;j<noOfColumns;j++)
    	{
    		DataFormatter df=new DataFormatter();
    		data[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
    		
    	}
    }
    workbook.close();
    fis.close();
    return data;
    
	}
}
