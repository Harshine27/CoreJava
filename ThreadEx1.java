package om.corejava.threads;

public class ThreadEx1  implements Runnable{

	public static void main(String[] args) {
		
		ThreadEx1 thread = new ThreadEx1();
		
		Thread th = new Thread(thread);
		
		th.start();
		
        for(int i=0;i<5;i++) {
			
			System.out.println("main Thread");
		}
		
	}

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("child Thread");
		}
		
		
	}

}
