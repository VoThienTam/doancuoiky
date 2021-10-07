package vn.doan.cuoiky;

public class TaiKhoan {
	private String tenTK;
	private String matKhau;
	private int iD;
	static int tK = 0;
	public String getTenTK() {
		return tenTK;
	}
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public TaiKhoan() {
		
	}
	public TaiKhoan(String tenTK, String matKhau, int iD) {
		super();
		this.tenTK = tenTK;
		this.matKhau = matKhau;
		this.iD = iD;
	}
public void inTTTK() {
		
		System.out.println("-------------------------------");
		System.out.println("\n  Thông tin tài khoản         ");
		System.out.println("  Tên tài khoản "+getTenTK());
		System.out.println("  Mật khẩu "+getMatKhau());
		System.out.println("  ID: "+getiD());
		System.out.println("-------------------------------");
	
	}
	

}
