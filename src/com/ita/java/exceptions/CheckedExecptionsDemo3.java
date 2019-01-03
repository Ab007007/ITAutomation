package com.ita.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExecptionsDemo3 {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("main started");
		readFile();
		System.out.println("Main Ended....");
	}
	
	
	public static void readFile() throws IOException
	{
		File f = new File("d:\\abc.text");
		FileInputStream fis = new FileInputStream(f);
		fis.close();
	}
}
