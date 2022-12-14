package com.excelr.testing;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {
	static XSSFWorkbook workbook;
	static String filePath;
    static XSSFSheet sheet;
    
		
	public Excel_Reader(String filePath,String sheetName) throws IOException
	{	
    workbook=new XSSFWorkbook(filePath);
    sheet=workbook.getSheet(sheetName);
	}
   
	
	public int getRowCount()
    {
    	return sheet.getPhysicalNumberOfRows();
    }
    
    public int getColCount()
    {
    	return sheet.getRow(0).getLastCellNum();
    }
    
    public String getValue(int row,int col)
    {
    	return sheet.getRow(0).getCell(col).getStringCellValue();
    	
    }
    
    public Object[][]getData()
    {
    	Object[][] data=new Object[getRowCount()][getColCount()];
    	for(int row=0;row<getRowCount();row++)
    	{
    		for(int col=0;col<getColCount();col++)
    		{
    			data[row][col]=getValue(row,col);
    		}
    	}
    	return data;
    }
    
	}

