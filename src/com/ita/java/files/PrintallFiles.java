package com.ita.java.files;

import java.io.File;

public class PrintallFiles {

	public static void main(String[] args) {
		
		File folder = new File("files");
		
		
		if(folder.isDirectory())
		{
			File[] files = folder.listFiles();
			
			for (File file : files) {
				System.out.println(file.getAbsolutePath());
				
			}
			
		}
	}
}
