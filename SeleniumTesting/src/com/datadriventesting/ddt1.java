package com.datadriventesting;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ddt1 
{
	public static void main(String[] args) throws BiffException, IOException 
	{
		File f = new File("C:\\Users\\PrabhuPushpaKumar\\Desktop\\AdminDataFile1.xls");
		//Error while reading the path "C:\Users\PrabhuPushpaKumar\Desktop\AdminDataFile1.xlsx"
		// Excel Application -> Excel File or Workbook -> Excel Sheet or Work Sheet.
		
		Workbook w = Workbook.getWorkbook(f);
		//(BiffException -> Binary Interchange File Format Exception)
		Sheet s = w.getSheet("Sheet1");
		int rows = s.getRows();
		int columns = s.getColumns();
		
		System.out.println("The total number of rows are : " + rows);
		System.out.println("The total number of columns are : " + columns);
		
		String data [][] = new String [rows][columns];
		
		for (int i=0; i<rows; i++)
			for (int j=0; j<columns; j++)
			{
				Cell c = s.getCell(j, i);    // To read a cell value mention (column, row), To pass or enter a cell value mention (row,column)
				data [i][j] = c.getContents();
				System.out.println("The data in a Respective row and column is :- " + data [i][j]);
			}
	}
}
