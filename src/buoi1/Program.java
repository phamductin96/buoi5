package buoi1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hs 1
		HocSinh hocsinh1 = new HocSinh();
		hocsinh1.id = 1;
		hocsinh1.name = " Nguyen Hoang Hung";
		hocsinh1.queQuan = "Nam Dinh";
		hocsinh1.gioiTinh = Gender.NAM;
		//hs 2
		HocSinh hocsinh2 = new HocSinh();
		hocsinh2.id = 2;
		hocsinh2.name = " Nguyen Hoang";
		hocsinh2.queQuan = "Ha Noi";
		hocsinh2.gioiTinh = Gender.NU;
		//hs 3
		System.out.println(hocsinh1.id);
		//System.out.println(hocsinh1.name);
		//System.out.println(hocsinh2.queQuan);
		System.out.println(hocsinh2.gioiTinh);
	}

}
