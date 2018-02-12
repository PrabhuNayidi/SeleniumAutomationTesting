package com.datadriventesting;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ddt3
{
	public Object [] [] readData() throws BiffException, IOException
	{
		File f = new File("C:\\Users\\PrabhuPushpaKumar\\Desktop\\AdminDataFile2.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		
		int rows = s.getRows();
		int columns = s.getColumns();
		
		String intdata [] [] = new String [5] [10];
		
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
			{
				Cell c = s.getCell(j,i);
				intdata [i] [j] = c.getContents();
			}
		return intdata;
	}
	
}
