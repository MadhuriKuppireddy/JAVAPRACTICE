package com.kod.thread;

public class AutoCorrection extends Thread{
	public void run() {
		for(;;) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("autocorrection");
		}
	}
}
