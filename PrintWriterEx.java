package com.corejava.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("Sample3.txt");

		PrintWriter pw = new PrintWriter(fw);

		pw.println(100);

		pw.println("Harshine");

		pw.println(true);

		pw.println('a');

		pw.flush();

		pw.close();

		fw.close();

		System.out.println("file is Sucuessfully created");
	}

}
