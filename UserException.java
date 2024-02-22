package com.corejava.exceptions;

class InvalidLoginCredentials extends Exception {

	String username;
	
	String password;

	public InvalidLoginCredentials(String username, String password) {

		this.username = username;
		
		this.password = password;
	}

	public String toString() {
		
		return "Please enter valid credentials";

	}

}

public class UserException {

	static void credentials(String username, String password) throws InvalidLoginCredentials {
		
		if (username != "Harshine")
			
			throw new InvalidLoginCredentials(username, password);

		else if (password != "Harshine27")

			throw new InvalidLoginCredentials(username, password);
		else
			System.out.println("Login Sucuessfully");

	}

	public static void main(String[] args) throws InvalidLoginCredentials {

		//try {
			UserException.credentials("Harshine", "Harshine27");

		//} catch (InvalidLoginCredentials e) {

			//System.out.println(" Enter valid credentials ");

		//}

	}

}
