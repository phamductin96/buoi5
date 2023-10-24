package buoi3;

public class Program {

	public static void main(String[] args) {
		Department department1 = new Department(); // khởi tạo department1 là đối tượng mới
		department1.id = 1;
		department1.name = "IT";
		
		Department department2 = new Department(); // khởi tạo department2 là đối tượng mới
		department2.id = 2;
		department2.name = "English";
		
		Department department3 = new Department(); // khởi tạo department3 là đối tượng mới
		department3.id = 3;
		department3.name = "Graphics";
		
		Department department4 = new Department(); // khởi tạo department4 là đối tượng mới
		department4.id = 4;
		department4.name = "Designer";
		
		Department department5 = new Department(); // khởi tạo department3 là đối tượng mới
		department5.id = 5;
		department5.name = "Full main";
		
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Menter";  //  Menter: Người cố vấn
		
		Position position2 = new Position();
		position2.id = 2;
		position2.name = "Student";  // Student: Học sinh
		
		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Admin";
		
	// Tạo acc và gắn thêm phòng và chức vụ
		Account account1 = new Account();
		account1.id = 1;
		account1.userName = "phamductin";
		account1.mail = "1@gmail.com";
		account1.gender = Gender.MALE;
		account1.positionid = position3;
		account1.departmentid = department5;
		
		Account account2 = new Account();
		account2.id = 2;
		account2.userName = "phamvantrieu";
		account2.mail = "2@gmail.com";
		account2.gender = Gender.MALE;
		account2.positionid = position2;
		account2.departmentid = department1;
		
		Account account3 = new Account();
		account3.id = 3;
		account3.userName = "nguyenthiphuongthao";
		account3.mail = "3@gmail.com";
		account3.gender = Gender.FEMALE;
		account3.positionid = position2;
		account3.departmentid = department1;
		
		Account account4 = new Account();
		account4.id = 4;
		account4.userName = "phamhaiyen";
		account4.mail = "4@gmail.com";
		account4.gender = Gender.FEMALE;
		account4.positionid = position2;
		account4.departmentid = department3;
		
		Account account5 = new Account();
		account5.id = 5;
		account5.userName = "phamanhkhoa";
		account5.mail = "5@gmail.com";
		account5.gender = Gender.MALE;
		account5.positionid = position2;
		account5.departmentid = department3;
		
		Account[] lop1Java = {account1,account2,account3};// khai báo lop1Java dạng mảng và có 3 acc
		Account[] lop2Java = {account1,account2};
		
		Clazz class1 = new Clazz(); // khai báo 1 lớp có tên là class1
		class1.id = 1;
		class1.name = "IT1";
		class1.study =lop1Java;
		
		Clazz class2 = new Clazz(); // khai báo 1 lớp có tên là class1
		class1.id = 2;
		class1.name = "IT2";
		class1.study =lop2Java;
		
		System.out.println(account2);
		//System.out.println(account1.id  +  account1.userName + class1.study);
		
		
		
	}

}
