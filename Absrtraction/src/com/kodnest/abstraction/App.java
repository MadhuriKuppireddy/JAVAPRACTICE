package com.kodnest.abstraction;

abstract class Vehicle {
	abstract  void refuel();
	 public void start() {
		 System.out.println("Vehicle has started");
	}
	 public void stop() {
		 System.out.println("Vehicle has stopped");
	}
}

class ElectricCar extends Vehicle{

	@Override
	void refuel() {
		System.out.println("Charging the car's battery");
		
	}
}

class PetrolCar extends Vehicle{

	@Override
	void refuel() {
		System.out.println("Petrol is used to start the car");
		
	}
}


class DieselCar extends Vehicle{

	@Override
	void refuel() {
		System.out.println("filling up with Diesel");
		
	}
}
public class App {
	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar();
		ec.start();
		ec.stop();
		ec.refuel();
		PetrolCar pc = new PetrolCar();
		pc.start();
		pc.stop();
		pc.refuel();
		DieselCar dc = new DieselCar();
		dc.start();
		dc.stop();
		dc.refuel();
	
		
	}
}
