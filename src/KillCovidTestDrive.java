package vn.doan.cuoiky;


import java.util.Scanner;

public class KillCovidTestDrive {
static Menu menu = new Menu();
//static TaiKhoan taiKhoan = new TaiKhoan();
static NguoiDung nguoiDung = new NguoiDung();
static BacSi bacSi = new BacSi();
//static DanhSachNguoiDung danhSachNguoiDung = new DanhSachNguoiDung();
static Scanner nhap = new Scanner(System.in);
public static void main(String[] args) {
	killCovidHomePage();
//	nguoiDung.dangKy();
//	nguoiDung.dangNhap();
//	bacSi.dangNhap();
}
//public static void homePageKillCovid() {
//	int luachon = 0;
//menu.menuHomePage();
//luachon = nhap.nextInt();
//if(luachon == 1) {
//nguoiDung.dangKy();
//menu.canNgang(11);
//System.out.println("  ~~~ Nhấn 2 chọn đăng nhận ~~~");
//menu.canNgang(11);
//System.out.println("  ~~~ Nhấn 3 chọn đổi mật khẩu  ~~~");
//menu.canNgang(11);
//System.out.println("  ~~~ Nhấn 4 chọn tài khoản  ~~~");
//
//}luachon = nhap.nextInt();
//if(luachon ==2 ) {
//	nguoiDung.dangNhap();
//killCovidManagementInterface();
//}else if(luachon == 3) {
//	nguoiDung.doiMatKhau();
//	homePageKillCovid();
//}else if(luachon == 4) {
//	nguoiDung.quenTaiKhoan();
//	homePageKillCovid();
//}
//
//
//}
public static void killCovidHomePage() {
	int luachon = 0;

do {
	try {
		menu.menuHomePage();
		luachon = nhap.nextInt();
		switch (luachon) {
		case 1:
			menu.canNgang(11);
			System.out.println("     Đăng Ký Người Dùng");
			menu.canNgang(11);
			System.out.println("        ~~~Nhấn 1~~~   ");
			menu.canNgang(11);
			System.out.println("     Đăng Ký Quản Lý");
			menu.canNgang(11);
			System.out.println("        ~~~Nhấn 2~~~   ");
			int dk = nhap.nextInt();
			if(dk == 1) {
			nguoiDung.dangKy();
			}else if(dk == 2) {
			bacSi.dangKy();
			}else {
				System.out.println("!!! Ngoài Phạm Vi !!!");
			}
			break;
		case 2:
			menu.canNgang(11);
			System.out.println("      Đăng Nhập Người Dùng");
			menu.canNgang(11);
			System.out.println("         ~~~Nhấn 1~~~   ");
			menu.canNgang(11);
			System.out.println("      Đăng Nhập Quản Lý");
			menu.canNgang(11);
			System.out.println("         ~~~Nhấn 2~~~   ");
			int dn = nhap.nextInt();
			if(dn == 1) {
			nguoiDung.dangNhap();
			killCovidUserInterface();
			}else if(dn == 2) {
				bacSi.dangNhap();
				killCovidManagementInterface();
			}
			break;
		case 3:
			menu.canNgang(11);
			System.out.println("   Đổi Mật Khẩu Người Dùng");
			menu.canNgang(11);
			System.out.println("        ~~~Nhấn 1~~~   ");
			menu.canNgang(11);
			System.out.println("   Đổi Mật Khẩu Quản Lý");
			menu.canNgang(11);
			System.out.println("        ~~~Nhấn 2~~~   ");
			int dmk = nhap.nextInt();
			if(dmk == 1) {
			nguoiDung.doiMatKhau();
			killCovidHomePage();
			}else if(dmk == 2) {
				bacSi.doiMatKhau();
				killCovidHomePage();
			}else {
				System.out.println("Ngoài phạm vi");
			}
			break;
		case 4:
			menu.canNgang(11);
			System.out.println("   Quên Tài Khoản Người Dùng");
			menu.canNgang(11);
			System.out.println("        ~~~Nhấn 1~~~   ");
			menu.canNgang(11);
			System.out.println("   Quên Tài Khoản Quản Lý");
			menu.canNgang(11);
			System.out.println("        ~~~Nhấn 2~~~   ");
			int qtk = nhap.nextInt();
			if(qtk == 1) {
			nguoiDung.quenTaiKhoan();
			killCovidHomePage();
			}else if(qtk == 2) {
				bacSi.quenTaiKhoan();
				killCovidHomePage();
			}
		}
		
	} catch (Exception e) {
		System.out.println("Có lỗi xãy ra");
		// TODO: handle exception
	}
} while(luachon < 5);


}
public static void killCovidUserInterface() {
	int luachon = 0;
	do {
		try {
			menu.menuNguoiDung();
			luachon = nhap.nextInt();
			switch (luachon) {
			case 1:
				nguoiDung.lichXetNghiem();
				break;
			case 2:
				nguoiDung.nhanKetQuaXetNghiem();
				break;
			case 3:
				killCovidHomePage();
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Có lỗi xãy ra");
		}
	}while(luachon < 4);
}
public static void killCovidManagementInterface() {
	int luachon = 0;
	do {
		try {	
			menu.menuNguoiQuanLy();
			luachon = nhap.nextInt();
			
			switch(luachon) {
			case 1:
				bacSi.guiKetQuaXetNghiem();
				break;
			case 2:
					menu.menuManager();
					int lc = nhap.nextInt();
					if(lc == 1) {
						System.out.println("    ~~ Thêm Người Dùng ~~");
						bacSi.themND();
						}else if(lc == 2) {
						System.out.println("    ~~ Sửa Người Dùng ~~");
						bacSi.suaND();
						}else if(lc == 3) {
						System.out.println("    ~~ Tìm Người Dùng ~~");
						bacSi.timND();
						}else if(lc == 4) {
						System.out.println("    ~~ Xóa Người Dùng ~~");
						bacSi.xoaND();
						}else if(lc == 5) {
						bacSi.danhSachKQXN();
					}else if(lc == 6) {
						System.out.println("    ~~ In Danh Sách Người Dùng ~~");
						bacSi.inDSND();
						}else if(lc == 7){
						System.out.println("Quay Lại Quản Lý Người Dùng");
						killCovidManagementInterface();
						}else{
						
						System.out.println("!! Ngoài Phạm Vi !!");
					}
					
					break;
			
			case 3:
				killCovidHomePage();
			}
		}catch(Exception e) {
			System.out.println("Có lỗi xảy ra!!!");
//			nhap.nextLine();
		}
	}while(luachon < 4);
}

	
}



