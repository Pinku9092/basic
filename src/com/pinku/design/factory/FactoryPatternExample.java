package com.pinku.design.factory;

abstract class Vehicle{
	public abstract int getWheel();
	
	@Override
	public String toString() {
		return "Wheel: "+this.getWheel();
	}
}

class Car extends Vehicle{
	int wheel;
	Car(int wheel){
		this.wheel = wheel;
	}
	
	@Override
	public int getWheel() {
		return this.wheel;
	}
}

class Bike extends Vehicle{
	int wheel;
	public Bike(int wheel) {
		this.wheel = wheel;
	}
	@Override
	public int getWheel() {
		
		return this.wheel;
	}
}

class VehicleFactory{
	public static Vehicle getInstance(String type, int wheel) {
		if(type == "Car") {
			return new Car(wheel);
		}else if(type == "bike") {
			return new Bike(wheel);
		}
		return null;
	}
}
public class FactoryPatternExample {
	
	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getInstance("Car", 4);
		System.out.println(car);
		Vehicle bike = VehicleFactory.getInstance("bike", 2);
		System.out.println(bike);
	}

}



