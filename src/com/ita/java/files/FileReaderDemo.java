package com.ita.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
//		File f = new File("files//Hello.txt");
//		FileReader fr = new FileReader(f);
//		BufferedReader br =  new BufferedReader(fr);
		
		BufferedReader br = new BufferedReader(new FileReader(new File("files//Hello.txt")));
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		br.close();
		
	}
}
