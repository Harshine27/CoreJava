package com.corejava.threads;

public class SleepJoinEx  extends Thread{
	
  @Override
  public void run() {
	  
	  for (int i = 0; i < 5; i++) {
		  
		  try {
			  
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		  System.out.println("child Thread");
		
	}
	  
  }

	public static void main(String[] args) throws InterruptedException {
		
		SleepJoinEx th = new SleepJoinEx();
		
		th.start();
		
		th.join();
		
		for (int i = 0; i < 5; i++) {
			
			th.sleep(2000); // 2 sec
			  
			  System.out.println("main Thread");
			
		}
		
		
	}

		
}


