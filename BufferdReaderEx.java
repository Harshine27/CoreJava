package com.corejava.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderEx {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("Sample3.txt");

		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line != null) {

			System.out.println(line);

			line = br.readLine();

		}

	}

}
