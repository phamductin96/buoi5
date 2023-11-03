package frontend;

import entity.Person;
import entity.Student;
import entity.Teacher;

public class Program {

	public static void main(String[] args) {
//		Student[] student = new Student[5]; // Đưa số học sinh vào trong mảng 
//		student[0] = new Student(1, "A", "HN");
//		student[1] = new Student(2, "B", "HN");
//		student[2] = new Student(3, "C", "HN");
//		student[3] = new Student(4, "D", "HN");
//		student[4] = new Student(5, "E", "HN");
//		
//		Teacher[] teacher = new Teacher[5]; // Đưa số giao viên vào mảng
//		teacher[0] = new Teacher(6, "F", "HN"); 
//		teacher[1] = new Teacher(7, "G", "HN"); 
//		teacher[2] = new Teacher(8, "H", "HN"); 
//		teacher[3] = new Teacher(9, "I", "HN"); 
//		teacher[4] = new Teacher(10, "K", "HN"); 
		
//		for (Student studentIN : student ) {
//			System.out.println(studentIN.Name);
//		}
//		for (Student teacherIN : student ) {
//			System.out.println(teacherIN.Name);
//		}
		
		Person[] person = new Person[10];
		person[0] = new Student(1, "A", "HN");
		person[1] = new Student(2, "B", "HN");
		person[2] = new Student(3, "C", "HN");
		person[3] = new Student(4, "D", "HN");
		person[4] = new Student(5, "E", "HN");
		
		person[5] = new Teacher(6, "F", "HN"); 
		person[6] = new Teacher(7, "G", "HN"); 
		person[7] = new Teacher(8, "H", "HN"); 
		person[8] = new Teacher(9, "I", "HN"); 
		person[9] = new Teacher(10, "K", "HN");
		
//		for (Person personIN:person) {
//		System.out.println(personIN.Name + " " + personIN.Address);
//	}
		// Chỉ in ra hành động ngủ của học sinh.
		for (Person personIN:person) {
			if (personIN instanceof Student) {  // Câu lệnh điều kiện để chỉ in ra thuộc tính của học sinh là ngủ
				Student student = (Student) personIN;
				student.Sleep();
			}
		}
	}
}
