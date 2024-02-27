package om.corejava.threads;

public class ThreadEx2 extends Thread {

	public static void main(String[] args) {

		ThreadEx2 thread = new ThreadEx2();

		thread.start();
		
		for (int i = 0; i < 10; i++) {

			System.out.println("main Thread");
		}

	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Child Thread");
		}

	}

}
