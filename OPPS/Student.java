package OPPS;

public class Student{
	
	String name;
	private int roll;
	final double conversionFactor = 0.95; // final keyword -> not change the value further same or other classes.
	
	// getter and setter method
	
	public String getStudentName() {
		return name;
	}
	
	public void setStudentName(String names) {
		name = names;
	}
	
	public int getRollNumber() {
		return roll;
	}
	
	public void setRollNumber(int roll) {
		if(roll <= 0) return;
		this.roll = roll;
		System.out.println("this: " + this);  // reference to current object i.e, Student class
	}
	


}
