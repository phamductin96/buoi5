package entity;

public class Student extends Person {

	public Student(int id, String name, String address) {
		super(id, name, address);
	}
	// Method
	public void Sleep () {
		System.out.println("Student Sleep");
	}

}
