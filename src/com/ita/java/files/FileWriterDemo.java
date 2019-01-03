package com.ita.java.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		File file  = new File("files\\NewFile.txt");
		file.createNewFile();
		FileWriter out = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(out);
		
		bw.write("Hi.. i'm writing from program");
		bw.newLine();
		bw.write("Excellent!!!!");

		bw.close();
		
		
	}
}
