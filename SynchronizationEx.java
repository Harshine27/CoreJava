package com.corejava.threads;

class First {

	public synchronized void display(String msg) throws InterruptedException {

		System.out.print("[ " + msg);

		Thread.sleep(3000);

		System.out.println("]");

	}

}

class Second extends Thread {

	String msg;

	First fobj; // has - a relationship

	Second(First fobj, String msg) {

		this.fobj = fobj;
		
		this.msg = msg;
		
		this.start();
	}

	public void run() {
		
		try {
			
			fobj.display(msg);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}

public class SynchronizationEx {

	public static void main(String[] args) {

		First fnew = new First();

		Second ss = new Second(fnew, "Welcome");

		Second ss1 = new Second(fnew, "New");

		Second ss2 = new Second(fnew, "Java Programmer ");

	}
}
