package vn.doan.cuoiky;
	
public class Menu {
	public static void main(String[] args) {
//	menuHomePage();
//		canNgang(40);
	}
public  void menuHomePage() {
	int n = 204;
	int m = 12;
	for(int i = 0; i <= n; i++) {
		System.out.print("^");
		}
	System.out.println("");

	System.out.println("||\t\t\t\t\t\\t\t\t	 | TRANG CHỦ | "+"\t\t\t\t\t\t\t| 1.ĐĂNG KÝ | 2.ĐĂNG NHẬP | \t\t   ||" );
	System.out.println("||\t\t\t\t\t\t\\t\t\t                  \t\t\t\t\t\t| 3.ĐỔI MẬT KHẨU | 4.QUÊN TÀI KHOẢN| \t   ||" );
	for(int j = 0; j <= m; j++) {
		System.out.println("||"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ||");
	}
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t PHẦN MỀM QUẢN LÝ XÉT NGHIỆM \t\t\t\t\t\t\t\t\t\t\t   ||");
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t KILL COVID \t\t\t\t\t\t\t\t\t\t\t\t   ||");
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Member : \t\t\t\t\t\t\t\t\t   || ");
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Võ Tấn Đạt \t\t\t\t\t\t\t\t   ||");
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Phạm Thị Ngọc Trang \t\t\t\t\t\t\t   ||");
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Võ Thiện Tâm \t\t\t\t\t\t\t   ||");
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Lê Phi Hùng \t\t\t\t\t\t\t\t   ||");
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   Lê Văn Nam \t\t\t\t\t\t\t\t   ||");
	for(int l = -3; l <=m ; l++) {
		System.out.println("||"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ||");

	}
	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t CHUNG TAY CÙNG NHAU ĐẨY LÙI COVID \t\t\t\t\t\t\t\t\t\t   ||");
//	System.out.println("||\t\t\t\t\t\t\t\t\t\t\t                                   \t\t\t\t\t\t\t\t\t\t   ||");
	for(int i = 0; i <= n; i++) {
		System.out.print("_");
		}



	
}
//	public  static void menuHomePage() {
//		canDoc(204);
//		System.out.println("");
//		System.out.print("||");
//		canNgang(12);
//		System.out.print("| TRANG CHỦ |");
//		canNgang(7);
//		System.out.print("| 1.ĐĂNG KÝ |");
//		System.out.print(" 2. ĐĂNG NHẬP |");
//		canNgang(2);
//		System.out.println("   ||");
//		System.out.print("||");
//		canNgang(20);
//		System.out.print("| 3. ĐỔI MẬT KHẨU |");
//		System.out.print(" 4. QUÊN TÀI KHOẢN |");
//		canNgang(1);
//		System.out.println("   ||");
//		int n = 12;
//		for(int j = 0; j <= n; j++) {
//		System.out.println("||"+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ||");
//		canNgang(11);
//		System.out.print("PHẦN MỀM QUẢN LÝ XÉT NGHIỆM");
//		
//		
//	}
//		
//	}
public void menuNguoiDung() {
	canNgang(11);
	System.out.println("  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	canNgang(11);
	System.out.println("||            KillCovid            ||");
	canNgang(11);
	System.out.println("||   1. Đăng ký lịch xét nghiệm    ||");
	canNgang(11);
	System.out.println("||   2. Nhận kết quả xét nghiệm    ||");
	canNgang(11);
	System.out.println("||   3. Trở lại trang chủ          ||");
	canNgang(11);
	System.out.println("  ================================= ");
	canNgang(11);
	System.out.println(" ~~Xin Mời Bạn Hãy Đưa Ra Lựa Chọn~~ ");
}
public void menuNguoiQuanLy() {
	canNgang(11);
	System.out.println("  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	canNgang(11);
	System.out.println("||            KillCovid            ||");
	canNgang(11);
	System.out.println("||   1. Gửi kết quả xét nghiệm     ||");
	canNgang(11);
	System.out.println("||   2. Quản lý người dùng         ||");
	canNgang(11);
	System.out.println("||   3. Trở lại trang chủ          ||");
	canNgang(11);
	System.out.println("  ================================= ");
	canNgang(11);
	System.out.println(" ~~Xin Mời Bạn Hãy Đưa Ra Lựa Chọn~~ ");
}	
public void menuManager() {
	canNgang(11);
	System.out.println("  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ ");
	canNgang(11);
	System.out.println("||       Danh Sách Tài Khoản         ||");
	canNgang(11);
	System.out.println("||   1. Thêm Người Dùng              ||");
	canNgang(11);
	System.out.println("||   2. Sửa Người Dùng               ||");
	canNgang(11);
	System.out.println("||   3. Tìm Người Dùng               ||");
	canNgang(11);
	System.out.println("||   4. Xóa Người Dùng               ||");
	canNgang(11);
	System.out.println("||   5. Danh Sách Kết Quả Xét NGhiệm ||");
	canNgang(11);
	System.out.println("||   6. In Danh Sách Người Dùng      ||");
	canNgang(11);
	System.out.println("||   7. Quay Lại Quản Lý Người Dùng  ||");
	canNgang(11);
	System.out.println("  ================================= ");
	canNgang(11);
	System.out.println(" ~~Xin Mời Bạn Hãy Đưa Ra Lựa Chọn~~ ");
}

public void menuDanhSachKQXN() {
	canNgang(11);
	System.out.println("  ============================= ");
	canNgang(11);
	System.out.println("|| Danh Sách Kết Quả Xét Nghiệm ||");
	canNgang(11);
	System.out.println("|| 1. Danh Sách Dương Tính      ||");
	canNgang(11);
	System.out.println("|| 2. Danh Sách Âm Tính         ||");
	canNgang(11);
	System.out.println("|| 3. Số Lượng Dương Tính       ||");
	canNgang(11);
	System.out.println("|| 4. Số Lượng Âm Tính          ||");
	canNgang(11);
	System.out.println("  ==============================");
	canNgang(11);
	System.out.println(" ~~Xin Mời Bạn Hãy Đưa Ra Lựa Chọn~~ ");
}
public void menuSuaND() {
	canNgang(11);
	System.out.println("Bạn muốn sửa thông tin gì");
	
	canNgang(11);
	System.out.println("  =================================");
	canNgang(11);
	System.out.println("||        1.Sửa họ tên             ||");
	canNgang(11);
	System.out.println("||        2.Sửa số CMND            ||");
	canNgang(11);
	System.out.println("||        3.Sủa địa chỉ            ||");
	canNgang(11);
	System.out.println("||        4.Sửa lịch xét nghiệm    ||");
	canNgang(11);
	System.out.println("||        5.Sửa SĐT                ||");
	canNgang(11);
	System.out.println("||        6.Sửa kết quả xét nghiệm ||");
	canNgang(11);
	System.out.println("  =================================");
}
public void canNgang(int n) { 
	for(int i = 0; i < n; i++) {
		System.out.print("\t");
		
	}
}
public static void canDoc(int d) {
	for(int i = 0; i <= d; i++) {
		System.out.print("^");
		}
}
}
