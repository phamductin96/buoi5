package buoi3;

public class Account { // Acc: tài khoản cá nhân
	int id;
	String mail;
	String userName;
	Gender gender;
	Department departmentid;
	Position positionid;
	
	@Override  // Định nghĩa để in ra màn hình những trường cần thiết để in ra
		public String toString() {
			String hienthi = "";
			hienthi += id + " " + userName + " " + gender + " ";
			return hienthi;
		}
}
