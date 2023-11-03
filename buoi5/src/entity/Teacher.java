package entity;

public class Teacher extends Person {

	public Teacher(int id, String name, String address) {
		super(id, name, address);
	}
	// Method 
	public void Sleep () {
		System.out.println("Teacher Sleep ...");
	};
}
