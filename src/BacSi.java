package vn.doan.cuoiky;

import java.util.Scanner;

public class BacSi extends Nguoi {
	private String chucVu;
	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
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
		// TODO Auto-generated method stub
		quyenTruyCap();
		managerTaiKhoan.dangNhap(getQuyenTruyCap());
	}

	@Override
	public void quenTaiKhoan() {
		quyenTruyCap();
		managerTaiKhoan.quenTaiKhoan(getQuyenTruyCap());
		// TODO Auto-generated method stub
//		managerTaiKhoan.quenTaiKhoan(qu);
	}

	@Override
	public void doiMatKhau() {
		quyenTruyCap();
		managerTaiKhoan.doiMatKhau(getQuyenTruyCap());
		// TODO Auto-generated method stub
		
	}
	DanhSachNguoiDung danhSachNguoiDung = new DanhSachNguoiDung();
	public void themND() {
		danhSachNguoiDung.themND();
	}
	public void suaND() {
		danhSachNguoiDung.suaND();
	}
	public void timND() {
		danhSachNguoiDung.timND();
	}
	public void xoaND() {
		danhSachNguoiDung.xoaND();
	}
	public void danhSachKQXN() {
		danhSachNguoiDung.danhSachKQXN();
	}
	public void inDSND() {
		danhSachNguoiDung.inDSND();
	}
	@Override
	public void quyenTruyCap() {
		// TODO Auto-generated method stub
		super.quyenTruyCap();
		setQuyenTruyCap("Quản Lý");
	}
	public void guiKetQuaXetNghiem() {
		@SuppressWarnings("resource")
		Scanner nhap = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("   Nhập kết quả xét nghiệm");
		System.out.println("------------------------------");
		ManagerTaiKhoan.nguoiDung.setKqXN(nhap.nextLine());
	}

}
