package com.corejava.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("Sample1.txt");
		
		fw.write(98);
		
		fw.write("Harshine \n Divya");
		
		fw.write("\n");
		
		char ch[] = {'a','b','c'};
		
		fw.write(ch);
		
		fw.write("\n");
		
		fw.flush();//pushes the all the data 
		
		fw.close();//close the predefined class

	}

}
