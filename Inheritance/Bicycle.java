package Inheritance;

public class Bicycle extends Vehicle{

	public void print() {
		super.print();  // print use from parent class Vehicle by use super keyword
		System.out.print("Bicycle: " + "color "+ getColor() + " maxSpeed "+ maxSpeed);
		System.out.println();
	}
	
	public void printMaxSpeed() {
		
		System.out.print("maxSpeed "+ maxSpeed+ " " + "maxSpeed using super keyword: "+ super.maxSpeed);
		System.out.println();
	}
}
