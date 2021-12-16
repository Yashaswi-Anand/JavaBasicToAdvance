package OPPS;

public class ClassAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println("Student: "+s);
		// data from getter and setter method
		s.setStudentName("Yash");
		System.out.println(s.getStudentName());
		s.setRollNumber(0);
		System.out.println(s.getRollNumber());

	}

}

