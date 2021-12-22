package Inheritance;

public class Car extends Vehicle{
	
	int maxDoors;
	
	public void printCar() {
		System.out.print("Car: " + "color "+ getColor() + " maxSpeed "+ maxSpeed);
		System.out.println();
	}

}
