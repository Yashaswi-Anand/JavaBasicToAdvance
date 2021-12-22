package InheritanceTwo;

import Inheritance.Vehicle;

public class Truck extends Vehicle{ // Truck is derived class n
	
	public void printCar() {
		System.out.print("Car: " + "color "+ getColor() + " maxSpeed "+ maxSpeed);
		System.out.println();
	}

}
