package buoi2;

import java.util.Scanner;

public class cauDieuKien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int so1;
		int so2;
		int so3;
		int so4;
		Scanner socantim = new Scanner(System.in);
	System.out.println("Nhap vao so thư 1:");
	so1 = socantim.nextInt();
	System.out.println("Nhap vao so thư 2:");
	so2 = socantim.nextInt();
	System.out.println("Nhap vao so thư 3:");
	so3 = socantim.nextInt();
	System.out.println("Nhap vao so thư 4:");
	so4 = socantim.nextInt();
	
	
	if ((so1>so2)&&(so1>so3)&&(so1>so4)) {
		System.out.println("Số lớn nhất là:" + so1);
	}
	else if ((so2>so1)&&(so2>so3)&&(so2>so4)) {
		System.out.println("Số lớn nhất là:" + so2);
	}
	else if ((so3>so1)&&(so3>so2)&&(so3>so4)) {
		System.out.println("Số lớn nhất là:" + so3);
	}
	
	else {
		System.out.println("Số lớn nhất là:" + so4);
	}
	}

}
