package buoi2;

public class tinhtoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao bien
		int so1;
		int so2;
		int so3;
		int so4;
		int tong, hieu, tich, sodu;
		float thuong;
		//double linhtinh;
		// gan gia tri cho bien
		so1 = 5;
		so2 = 6;
		so3 = 7;
		so4 = 5;
		// tinh tong cua 2 or 3 so
		tong = so1 + so2 + so3;
		//System.out.println(tong);
// tinh hieu cua 2 or 3 so
		hieu = so2 - so1;
		//System.out.println(hieu);
// tinh tich cua 2 or 3 so
		tich = so1 * so2 * so3;
//System.out.println(tich);
		// tinh thuong cua 2 or 3 so
		thuong = (float)so2 / so1;
// lay so du cua 2 so
		sodu = so3 % so1;
		//System.out.println(thuong);
		//System.out.println(sodu);
// Kiem tra tinh chan le
		if ((so3 % 2)== 0 ) 
		{
			System.out.println("So Chan");
		} 
		else // ((so3 % 2) != 0)
		{
			System.out.println("So Le");
		}
// So sanh giua 2 so
		if (so1 > so4) {
			System.out.println(" So1 > So4");
		}
		else if (so1 == so4) {
			System.out.println("So 1 bang so 4");
		}
		else {
			System.out.println("So1 < So4");
		}
	}

}
