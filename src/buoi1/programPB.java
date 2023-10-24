package buoi1;

public class programPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhongBan nhanvienPB1 = new PhongBan();
		ChucVu chucvu1 = new ChucVu();
		
		//EchucVu chuVu = new EchucVu();
		nhanvienPB1.id = 1;
		nhanvienPB1.hoTen = "Tin Dai Ca";
		chucvu1.maChucVu = 11;
		chucvu1.tenChucVu = "Giam Doc";
		
		System.out.println((chucvu1.tenChucVu) );
	}

}
