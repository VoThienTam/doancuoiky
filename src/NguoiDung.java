package vn.doan.cuoiky;

import java.util.Scanner;

public class NguoiDung extends Nguoi {
	private String lichXetNghiem;
	private String kqXN;
	static int ngD = 0;
	
	public String getLichXetNghiem() {
		return lichXetNghiem;
	}

	public void setLichXetNghiem(String lichXetNghiem) {
		this.lichXetNghiem = lichXetNghiem;
	}

	public String getKqXN() {
		return kqXN;
	}

	public void setKqXN(String kqXN) {
		this.kqXN = kqXN;
	}

	public static int getNgD() {
		return ngD;
	}

	public static void setNgD(int ngD) {
		NguoiDung.ngD = ngD;
	}
	ManagerTaiKhoan managerTaiKhoan = new ManagerTaiKhoan();
	@Override
	public void dangKy() {
		// TODO Auto-generated method stub
		quyenTruyCap();
		managerTaiKhoan.dangKy(getQuyenTruyCap());
	}

	@Override
	public void dangNhap() {
		quyenTruyCap();
		// TODO Auto-generated method stub
		managerTaiKhoan.dangNhap(getQuyenTruyCap());
			
	}

	@Override
	public void quenTaiKhoan() {
		// TODO Auto-generated method stub
		quyenTruyCap();
		managerTaiKhoan.quenTaiKhoan(getQuyenTruyCap());
//		managerTaiKhoan.quenTaiKhoan();
		
	}

	@Override
	public void doiMatKhau() {
		quyenTruyCap();
		managerTaiKhoan.doiMatKhau(getQuyenTruyCap());
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void quyenTruyCap() {
		// TODO Auto-generated method stub
		super.quyenTruyCap();
		setQuyenTruyCap("Người Dùng");
	}
	public void lichXetNghiem() {
//		NguoiDung nguoiDung = new NguoiDung();
		
		System.out.println("---------------------");
		System.out.println(" Đặt lịch xét nghiệm");
		System.out.println("---------------------");
		@SuppressWarnings("resource")
		Scanner nhap = new Scanner(System.in);
		ManagerTaiKhoan.nguoiDung.setLichXetNghiem(nhap.nextLine());
		if(ManagerTaiKhoan.nguoiDung.getLichXetNghiem() == " ") {
			System.out.println("lỗi");
		}
	}
	public void nhanKetQuaXetNghiem() {
		System.out.println("------------------------------");
		System.out.println("Kết quả xét nghiệm của bạn là "+ManagerTaiKhoan.nguoiDung.getKqXN());
		System.out.println("------------------------------");
	}
	@Override
	public void inTT() {
		// TODO Auto-generated method stub
		super.inTT();
		System.out.println("--------------------------------");
		System.out.println("Thông tin người dùng");
		System.out.println("  Họ Tên: "+getHoTen());
		System.out.println("  Số CMND: "+getSoCMND());
		System.out.println("  Địa Chỉ: "+getDiaChi());
		System.out.println("  Lịch Xét Nghiệm: "+getLichXetNghiem());
		System.out.println("  SĐT: "+getSoDT());
		System.out.println("  Kết Quả Xét Nghiệm: "+getKqXN());
		System.out.println("--------------------------------");
	}
}
