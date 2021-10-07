package vn.doan.cuoiky;
	
import java.util.Scanner;

public class ManagerTaiKhoan {
	 static Scanner nhap = new Scanner(System.in);
//	static TaiKhoan taiKhoan = new TaiKhoan();
	static BacSi bacSi = new BacSi();
	static NguoiDung nguoiDung = new NguoiDung();
 Menu menu = new Menu();
// public static void main(String[] args) {
////	 nguoiDung.getQuyenTruyCap();
////	dangKy("Người dùng");
////	dangKy();
////	dangNhap("Người dùng");
////	dangNhap();
//}
 static TaiKhoan tkNgD = new TaiKhoan();
 static TaiKhoan tkBS = new TaiKhoan();
public  void dangKy(String quyen) {
	try {
		if(quyen.equalsIgnoreCase("Người Dùng")) {
	nguoiDung.quyenTruyCap();
	if(nguoiDung.getQuyenTruyCap().equalsIgnoreCase("Người Dùng"))
		menu.canNgang(11);
	System.out.println("------------------------------");	
	menu.canNgang(11);
	System.out.println(" Người dùng đăng ký tài khoản ");
	menu.canNgang(11);
	System.out.println("------------------------------");	
	@SuppressWarnings("resource")
	Scanner nhap = new Scanner(System.in);
	System.out.print("Họ và Tên: ");	
	nguoiDung.setHoTen(nhap.nextLine());
	System.out.println("_________");
	System.out.print("Số CMND: ");
	nguoiDung.setSoCMND(nhap.nextInt());
  System.out.println("_______");
	nhap.nextLine();
	System.out.print("Địa Chỉ: ");
	nguoiDung.setDiaChi(nhap.nextLine());
	System.out.println("_______");
	System.out.print("Số Phone: ");
	nguoiDung.setSoDT(nhap.nextInt());
	System.out.println("________");
	nhap.nextLine();
	System.out.print("Tên Tài Khoản: ");
	tkNgD.setTenTK(nhap.nextLine());
	System.out.println("_____________");
	System.out.print("Mật Khẩu: ");
	tkNgD.setMatKhau(nhap.nextLine());
	System.out.println("________");
	int code = (int) Math.floor(((Math.random() * 899999) + 100000));
	tkNgD.setiD(code);
	System.out.println("------------------------------");	
	System.out.println("  ID tài khoản: "+tkNgD.getiD());
	System.out.println("------------------------------");	
	System.out.println("  Quyền truy cập: "+nguoiDung.getQuyenTruyCap());
	System.out.println("------------------------------");	
	nguoiDung.getLichXetNghiem();
	DanhSachNguoiDung.dsND.add(nguoiDung);
		} else if(quyen.equalsIgnoreCase("Quản Lý")) {
			bacSi.quyenTruyCap();
			if(bacSi.getQuyenTruyCap().equalsIgnoreCase("Quản Lý") )
				menu.canNgang(11);
			System.out.println("---------------------------");	
			menu.canNgang(11);
			System.out.println(" Quản lý đăng ký tài khoản ");
			menu.canNgang(11);
			System.out.println("------------------------------");	
			@SuppressWarnings("resource")
			Scanner nhap = new Scanner(System.in);
			System.out.print("Nhập họ tên: ");	
			bacSi.setHoTen(nhap.nextLine());
		    System.out.println("___________");
			System.out.print("Nhập số CMND: ");
			bacSi.setSoCMND(nhap.nextInt());
		    System.out.println("____________");
			nhap.nextLine();
			System.out.print("Chức vụ: ");
			bacSi.setChucVu(nhap.nextLine());
		    System.out.println("_______");
			System.out.print("Nhập số điện thoại: ");
			bacSi.setSoDT(nhap.nextInt());
	        System.out.println("__________________");
			nhap.nextLine();
			System.out.print("Nhập tên tài khoản: ");
			tkBS.setTenTK(nhap.nextLine());
	        System.out.println("__________________");
			System.out.print("Nhập mật khẩu: ");
			tkBS.setMatKhau(nhap.nextLine());
		    System.out.println("_____________");
			int code = (int) Math.floor(((Math.random() * 899999) + 100000));
			tkBS.setiD(code);
			System.out.println("------------------------------");	
			System.out.println("ID tài khoản "+tkBS.getiD());
			System.out.println("------------------------------");	
			System.out.println("Quyền truy cập :"+bacSi.getQuyenTruyCap());
			System.out.println("------------------------------");	
		}
	
		}catch (Exception e) {
		System.out.println("Thông tin tài khoản không hợp lệ");
	dangKy(quyen);
	}
}
static int soLanDangNhapSai = 0;
public void dangNhap(String quyen) {
	if(quyen.equalsIgnoreCase("Người Dùng")) {
		nguoiDung.quyenTruyCap();
		if(nguoiDung.getQuyenTruyCap().equalsIgnoreCase("Người Dùng"))
			menu.canNgang(11);
	     	System.out.println("--------------------------------");
	     	menu.canNgang(11);
			System.out.println(" Người dùng đăng nhập tài khoản ");
			menu.canNgang(11);
			System.out.println("--------------------------------");
	Scanner nhap = new Scanner(System.in);
	
	System.out.print("Nhập tên tài khoản: ");
	String nttk = nhap.nextLine();
	System.out.println("__________________");
	if(tkNgD.getTenTK().equals(nttk)) {
		System.out.print("Nhập mật khẩu: ");
		String nmk = nhap.nextLine();
		System.out.println("_____________");
			if(tkNgD.getMatKhau().equals(nmk)) {
		System.out.println("------------------------------");			
		System.out.println("    Đăng nhập thành công");
		System.out.println("------------------------------");
			}else {
		soLanDangNhapSai++;
		if(soLanDangNhapSai == 1) {
		System.out.println("XXX Sai mật khẩu XXX");
		System.out.println("---------------");
		System.out.println("Đăng nhập lại");
		System.out.println("---------------");
		dangNhap(quyen);
		}
	}
	}else {
		soLanDangNhapSai++;
		if(soLanDangNhapSai == 1) {
		System.out.println("XXX Sai tên tài khoản XXX");
		System.out.println("---------------");
		System.out.println(" Đăng nhập lại");
		System.out.println("---------------");
		dangNhap(quyen);
		}
		}
	}else if(quyen.equalsIgnoreCase("Quản Lý")) {
		bacSi.quyenTruyCap();
		if(bacSi.getQuyenTruyCap().equalsIgnoreCase("Quản Lý"))
			menu.canNgang(11);
			System.out.println("-----------------------------");
			menu.canNgang(11);
			System.out.println(" Quản lý đăng nhập tài khoản ");
			menu.canNgang(11);
			System.out.println("-----------------------------");
	Scanner nhap = new Scanner(System.in);
	
	System.out.print("Nhập tên tài khoản: ");
	String nttk = nhap.nextLine();
	System.out.println("__________________");
	if(tkBS.getTenTK().equals(nttk)) {
		System.out.print("Nhập mật khẩu: ");
		String nmk = nhap.nextLine();
		System.out.println("_____________");
			if(tkBS.getMatKhau().equals(nmk)) {
		System.out.println("------------------------------");			
		System.out.println("    Đăng nhập thành công");
		System.out.println("------------------------------");
			}else {
		soLanDangNhapSai++;
		if(soLanDangNhapSai == 1) {
		System.out.println("XXX Sai mật khẩu XXX");
		System.out.println("---------------");
		System.out.println("Đăng nhập lại");
		System.out.println("---------------");
		dangNhap(quyen);
		}
	}
	}else {
		soLanDangNhapSai++;
		if(soLanDangNhapSai == 1) {
		System.out.println("XXX Sai tên tài khoản XXX");
		System.out.println("---------------");
		System.out.println(" Đăng nhập lại");
		System.out.println("---------------");
		dangNhap(quyen);
		}
		}
	}
		
	}
	
	
	
public  void quenTaiKhoan(String quyen) {
	if(quyen.equalsIgnoreCase("Người Dùng")) {
		nguoiDung.quyenTruyCap();
		if(nguoiDung.getQuyenTruyCap().equalsIgnoreCase("Người Dùng"))
			menu.canNgang(11);
		    System.out.println("---------------------------");
		    menu.canNgang(11);
			System.out.println(" Quên Tài Khoản Người Dùng ");
			menu.canNgang(11);
			System.out.println("---------------------------");
//	Scanner nhap = new Scanner(System.in);
	System.out.print("Nhập số điện thoại: ");
	int sdt = nhap.nextInt();
    System.out.println("__________________");
if(nguoiDung.getSoDT() == sdt) {
int code = (int) Math.floor(((Math.random() * 899999) + 100000));
	
	System.out.println("Mã lấy tài khoản: "+code);
	
	System.out.print("Nhập lại mã: ");
	int ma = nhap.nextInt();
	System.out.println("_____________ ");
	nhap.nextLine();
	if(ma == code ) {
    System.out.println("--------------------------------");	
	System.out.println(" Thông tin tài khoản của bạn là");
	System.out.println("--------------------------------");
	System.out.println(" Tên tài khoản: "+ tkNgD.getTenTK());
	System.out.println("--------------------------------");
	System.out.println(" Mật khẩu: "+ tkNgD.getMatKhau());
	System.out.println("--------------------------------");
}else {
	quenTaiKhoan(quyen);
}
	}else {
		quenTaiKhoan(quyen);
	}
}else if(quyen.equalsIgnoreCase("Quản Lý")) {
	bacSi.quyenTruyCap();
	if(bacSi.getQuyenTruyCap().equalsIgnoreCase("Quản Lý"))
		menu.canNgang(11);
	    System.out.println("------------------------");
	    menu.canNgang(11);
		System.out.println(" Quên Tài Khoản Quản Lý ");
		menu.canNgang(11);
		System.out.println("------------------------");
	System.out.print("Nhập số điện thoại: ");
	int sdt = nhap.nextInt();
	System.out.println("__________________");
if(bacSi.getSoDT() == sdt) {
int code = (int) Math.floor(((Math.random() * 899999) + 100000));
	System.out.println("Mã lấy tài khoản: "+code);
	System.out.print("Nhập lại mã: ");
	int ma = nhap.nextInt();
	System.out.println("___________");
	nhap.nextLine();
	if(ma == code ) {
	System.out.println("--------------------------------");
	System.out.println(" Thông tin tài khoản của bạn là");
	System.out.println("--------------------------------");
	System.out.println(" Tên tài khoản: "+ tkBS.getTenTK());
	System.out.println("--------------------------------");
	System.out.println(" Mật khẩu: "+ tkBS.getMatKhau());
	System.out.println("--------------------------------");
}else {
	quenTaiKhoan(quyen);
}
}else {
	quenTaiKhoan(quyen);
}
}
}

public void doiMatKhau(String quyen) {
	if(quyen.equalsIgnoreCase("Người Dùng")) {
		nguoiDung.quyenTruyCap();
		if(nguoiDung.getQuyenTruyCap().equalsIgnoreCase("Người Dùng"))
			menu.canNgang(11);
	     	System.out.println("-------------------------");
	     	menu.canNgang(11);
			System.out.println(" Người Dùng Đổi Mật Khẩu ");
			menu.canNgang(11);
			System.out.println("-------------------------");
//	Scanner nhap = new Scanner(System.in);
	
	System.out.print("Nhập số điện thoại: ");
	int sdt = nhap.nextInt();
	System.out.println("__________________");
	if(sdt == nguoiDung.getSoDT()) {
	int code = (int) Math.floor(((Math.random() * 899999) + 100000));
	
	System.out.println("Mã đổi mật khẩu: "+code);
	
	System.out.print("Nhập lại mã: ");
	int ma = nhap.nextInt();
	System.out.println("_____________ ");
	nhap.nextLine();
	if(ma == code ) {
	System.out.print("Nhập mật khẩu mới: ");
	tkNgD.setMatKhau(nhap.nextLine());
	System.out.println("_________________");
	
	}else  {
		int codex2 = (int) Math.floor(((Math.random() * 899999) + 100000));
		System.out.println("Có nhiêu đó cũng sai mã mới nè: "+codex2);
		System.out.print("Nhập lại mã: ");
		int max2 = nhap.nextInt();
		System.out.println("_____________ ");
		if(max2 == codex2) {
			System.out.print("Nhập mật khẩu mới: ");
			tkNgD.setMatKhau(nhap.nextLine());
			System.out.println("_________________");
		}
	}
}
	}else if(quyen.equalsIgnoreCase("Quản Lý")) {
		bacSi.quyenTruyCap();
		if(bacSi.getQuyenTruyCap().equalsIgnoreCase("Quản Lý"))
			menu.canNgang(11);
		    System.out.println("----------------------");
		    menu.canNgang(11);
			System.out.println(" Quản Lý Đổi Mật Khẩu ");
			menu.canNgang(11);
			System.out.println("----------------------");
//	Scanner nhap = new Scanner(System.in);
	
	System.out.print("Nhập số điện thoại: ");
	int sdt = nhap.nextInt();
	System.out.println("__________________");
	if(sdt == bacSi.getSoDT()) {
	int code = (int) Math.floor(((Math.random() * 899999) + 100000));
	
	System.out.println("Mã đổi mật khẩu: "+code);
	
	System.out.print("Nhập lại mã: ");
	int ma = nhap.nextInt();
	System.out.println("_____________ ");
	nhap.nextLine();
	if(ma == code ) {
	System.out.print("Nhập mật khẩu mới: ");
	tkBS.setMatKhau(nhap.nextLine());
	System.out.println("_________________");
	
	}else  {
		int codex2 = (int) Math.floor(((Math.random() * 899999) + 100000));
		System.out.println("Có nhiêu đó cũng sai mã mới nè: "+codex2);
		System.out.print("Nhập lại mã: ");
		int max2 = nhap.nextInt();
		System.out.println("_____________ ");
		if(max2 == codex2) {
			System.out.print("Nhập mật khẩu mới: ");
			tkBS.setMatKhau(nhap.nextLine());
			System.out.println("_________________");
		}
	}
}
		
	}
}
}
