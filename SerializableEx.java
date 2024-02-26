package com.corejava.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableEx {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee(100, "Harshine", 5000000, "Trainer");

		FileOutputStream out = new FileOutputStream("employees.txt");

		ObjectOutputStream obj = new ObjectOutputStream(out);

		obj.writeObject(emp);

		System.out.println("employee saved Sucussefully");

	}

}
