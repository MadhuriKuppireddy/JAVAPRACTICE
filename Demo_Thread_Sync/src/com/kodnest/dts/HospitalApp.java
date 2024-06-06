package com.kodnest.dts;

public class HospitalApp {
	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		Thread thread1 = new Thread(hospital);
		thread1.setName("Engineer");
		thread1.start();

		Thread thread2 = new Thread(hospital);
		thread2.setName("Lawyer");
		thread2.start();
	}
}

class Hospital implements Runnable{

	//Resource-run()
	@Override
	public synchronized void run() {
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name+"  is in ICU");
			Thread.sleep(2000);
			System.out.println(name+" is getting treatment");
			Thread.sleep(2000);
			System.out.println(name+" is discharged");
		}
		catch(Exception e){
			System.out.println("Exception Handled");
		}
	}

}