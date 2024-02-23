package com.corejava.fileio;

import java.io.File;
import java.io.IOException;
import java.io.File;

public class FileEx {

	public static void main(String[] args) throws IOException {

		File f = new File("Sample.txt");

		System.out.println(f.exists()); // false

		System.out.println(f.createNewFile());

		System.out.println(f.isDirectory()); // false

		System.out.println(f.isFile()); // true

	}

}
