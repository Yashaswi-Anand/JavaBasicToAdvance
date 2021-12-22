package Inheritance;

public class Vehicle {
	
	private String color;
	protected int maxSpeed;
	
	public int getColor() {
		return maxSpeed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.out.print("Vehicle: " + "color "+ color + " maxSpeed "+ maxSpeed);
		System.out.println();
	}

}
