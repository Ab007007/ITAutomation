package com.ita.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExecptionsDemo {

	public static void main(String[] args) {
		
		File f = new File("d:\\abc.text");
		
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream(f);
		}
		catch(FileNotFoundException ex )
		{
			System.out.println("File does not exist .. please check the locaiton ");
		}
		finally
		{
			try
			{
				fis.close();
			}
			catch(IOException ex)
			{
				System.out.println("fis not closed properly.. please verify");
			}
			catch(NullPointerException ex )
			{
				System.out.println("FileInputStream not created atall.., cant close it!!!");
			}
		}
		
		System.out.println("Main Ended....");
	}
}
