package OPPS;

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students s = new Students("Yash", 1234);
		Students s1 = new Students("Yash", 1234);
		Students s2 = new Students("Yash", 1234);
		
		s2.print();
		System.out.println(s1.numStudent);  // it is also OK.
		System.out.println(s2.numStudent);
		System.out.println(Students.numStudent); // static variable is called using Class name
		System.out.println(Students.CONVERSIONFACTOR);
		System.out.println(Students.getNumStudents()); // static function is called using Class name
		
	}

}

class Students{
	
	String name;
	final private int roll;
	static int numStudent =0; // static means = belongs to the class and shared by all the objects.
	public final static double CONVERSIONFACTOR = 0.95; // final -> not modified and static -> shared by all the objects.
	
	Students(String name,int roll){
		this.roll= numStudent++;
		this.name = name;
	}
	
	// static function
	public static int getNumStudents() {
		return numStudent;
	}
	
	public void print() {
		System.out.println("Name: "+ name +" " + "Roll: " + roll );
	}
}
