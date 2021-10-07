package vn.doan.cuoiky;

public abstract class Nguoi {
	private String hoTen;
	private String diaChi;
	private int soDT;
	private int soCMND;
	private String quyenTruyCap;
	public int getSoCMND() {
		return soCMND;
	}
	
	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getSoDT() {
		return soDT;
	}
	public void setSoDT(int soDT) {
		this.soDT = soDT;
	}
	public String getQuyenTruyCap() {
		return quyenTruyCap;
	}
	public void setQuyenTruyCap(String quyenTruyCap) {
		this.quyenTruyCap = quyenTruyCap;
	}
	public Nguoi(){
		
	}
	public Nguoi(String hoTen, String diaChi, int soDT, String quyenTruyCap) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDT = soDT;
		this.quyenTruyCap = quyenTruyCap;
	}
	public void quyenTruyCap() {}	
	public abstract void dangKy();
	public abstract void dangNhap();
	public abstract void quenTaiKhoan();
	public abstract void doiMatKhau();
	public void inTT(){
	}
}
