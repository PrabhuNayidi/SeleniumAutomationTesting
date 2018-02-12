package com.datadriventesting;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ddt3
{
	@Test(dataProvider="testdata")
	public void sum(String s1, String s2, String s3, String s4, String s5)
	{
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = Integer.parseInt(s3);
		int d = Integer.parseInt(s4);
		int e = Integer.parseInt(s5);
		int result = a + b + c + d + e;
		System.out.println("The Sum of given cells in the selected Excel File is : " + result);
	}
	@DataProvider(name="testdata")
	public Object [] [] readData() throws BiffException, IOException
	{
		File f = new File("C:\\Users\\PrabhuPushpaKumar\\Desktop\\IntegerDataFile.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		
		int rows = s.getRows();
		int columns = s.getColumns();
		
		String intdata [] [] = new String [10] [5];
		
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
			{
				Cell c = s.getCell(j,i);
				intdata [i] [j] = c.getContents();
			}
		return intdata;
	}
	
}
