package OPPS;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Yash",18342);
		System.out.println(e.getId());
		Employee e1 = new Employee("Ritesh");
		System.out.println(e1.getId());

	}

}

class Employee{
	// constructor
	
	String name;
	private int id;
	
	public Employee(String name , int id) {
		this.name = name;
		this.id = id;
	}
	
	public Employee(String name) {
		this.name = name;
		this.id = 10;
	}
	
	public int getId() {
		return id;
	}
	
}
