package com.ita.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExecptionsDemo2 {

	public static void main(String[] args) 
	{
		System.out.println("main started");
		try
		{
			readFile();
		}
		catch(FileNotFoundException ex )
		{
			System.out.println("exception while reading file ");
		}
		catch(IOException ex )
		{
			System.out.println("exception while reading file " + ex.getMessage());
		}
		System.out.println("Main Ended....");
	}
	
	
	public static void readFile() throws IOException
	{
		File f = new File("d:\\abc.text");
		FileInputStream fis = new FileInputStream(f);
		fis.close();
	}
}
