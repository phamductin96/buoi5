package entity;

public class Person {
public int id;
public String Name;
public String Address;
 // Thuộc tính
public Person(int id, String name, String address) {
	this.id = id;
	this.Name = name;
	this.Address = address;
}
 // Method: hành động
public void Sleep() {
	System.out.println("Person Sleep ...");
}
}
