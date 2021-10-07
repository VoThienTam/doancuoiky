package vn.doan.cuoiky;

import java.util.ArrayList;

import java.util.Scanner;
	public class DanhSachNguoiDung {
	static ArrayList<NguoiDung> dsND = new ArrayList<NguoiDung>();
	Scanner nhap = new Scanner(System.in);
	static NguoiDung nguoiDung = new NguoiDung();
	static int soLuongDuongTinh = 0;
	static int soLuongAmTinh = 0 ;
	Menu menu = new Menu();
	public void themND() {
		
		System.out.println("------------------------------");
		System.out.println("Muốn thêm bao nhiêu người dùng");
		System.out.println("------------------------------");
		int n = nhap.nextInt();
		nhap.nextLine();
		for(int i = 0; i < n; i++) {
			NguoiDung nguoiDung = new NguoiDung();
			System.out.println("...............");
			System.out.println(": Nhập họ tên :");
			System.out.println("...............");
			
			nguoiDung.setHoTen(nhap.nextLine());
			System.out.println("................");
			System.out.println(": Nhập số CMND :");
			System.out.println("................");
	
			nguoiDung.setSoCMND(nhap.nextInt());
			nhap.nextLine();
			System.out.println("................");
			System.out.println(": Nhập địa chỉ :");
			System.out.println("................");
	
			nguoiDung.setDiaChi(nhap.nextLine());
			System.out.println("........................");
			System.out.println(": Nhập lịch xét nghiệm :");
			System.out.println("........................");
	
			nguoiDung.setLichXetNghiem(nhap.nextLine());
			System.out.println("......................");
			System.out.println(": Nhập số điện thoại :");
			System.out.println("......................");
	
			nguoiDung.setSoDT(nhap.nextInt());
			nhap.nextLine();
			System.out.println("...........................");
			System.out.println(": Nhập kết quả xét nghiệm :");
			System.out.println("...........................");
	
			nguoiDung.setKqXN(nhap.nextLine());
			
			dsND.add(nguoiDung);
			NguoiDung.ngD ++;
	//		System.out.println("---------------------------------");
	//		System.out.println(" Danh sách đang có "+NguoiDung.ngD+" người dùng");
	//		System.out.println("---------------------------------");
		}
		
		
	}
	public void inDSND() {
		for (NguoiDung nguoiDung : dsND) {
			nguoiDung.inTT();
		}
	}
	public void xoaND() {
		System.out.println("----------------------------");
		System.out.println("Nhập CMND người dùng cần xóa");
		System.out.println("----------------------------");
		int xoaCMND = nhap.nextInt();
		for (NguoiDung nguoiDung : dsND) {
			if(nguoiDung.getSoCMND() == xoaCMND) {
				System.out.println("------------------------------------");
				System.out.println("Đã xóa người dùng có CMND: "+xoaCMND);
				System.out.println("------------------------------------");
				dsND.remove(nguoiDung);
	//			System.out.println("Danh sách người dùng sau khi xóa");
	//			nguoiDung.inTTND();
			}else {
				xoaND();
	//			System.out.println("Không tồn tại người dùng này");
			}	
			}
		}
	public void suaND() {
		System.out.println("----------------------------");
		System.out.println("Nhập CMND người dùng cần sửa");
		System.out.println("----------------------------");
		int suaCMND = nhap.nextInt();
		for (NguoiDung nguoiDung : dsND) {
			if(nguoiDung.getSoCMND() == suaCMND) {
				menu.menuSuaND();
				int a = nhap.nextInt();
				if(a == 1) {
					nhap.nextLine();
					System.out.println("---------------");
					System.out.println("Nhập họ tên mới");
					System.out.println("---------------");
					nguoiDung.setHoTen(nhap.nextLine());
				}else if(a == 2) {
					System.out.println("----------------");
					System.out.println("Nhập số CMND mới");
					System.out.println("----------------");
					nguoiDung.setSoCMND(nhap.nextInt());
				}else if(a == 3) {
					nhap.nextLine();
					System.out.println("----------------");
					System.out.println("Nhập địa chỉ mới");
					System.out.println("----------------");
					nguoiDung.setDiaChi(nhap.nextLine());
				}else if(a == 4) {
					nhap.nextLine();
					System.out.println("------------------------");
					System.out.println("Nhập lịch xét nghiệm mới");
					System.out.println("------------------------");
					nguoiDung.setDiaChi(nhap.nextLine());
				}else if(a == 5) {
					System.out.println("------------");
					System.out.println("Nhập SĐT mới");
					System.out.println("------------");
					nguoiDung.setSoDT(nhap.nextInt());
				}else if(a == 6) {
					nhap.nextLine();
					System.out.println("---------------------------");
					System.out.println("Nhập kết quả xét nghiệm mới");
					System.out.println("---------------------------");
					nguoiDung.setKqXN(nhap.nextLine());
					
					
				}else {
					System.out.println("XXX Không thích sửa nữa XXX");
				}
				nguoiDung.inTT();
			}else {
	//			suaND();
	//			System.out.println("XXX Không tồn tại tài khoản này XXX");
			}
			}
	}
	public void timND() {
		System.out.println("-----------------------------------");
		System.out.println("Nhập số CMND của người dùng cần tìm");
		System.out.println("-----------------------------------");
		int timCMND = nhap.nextInt();
		for (NguoiDung nguoiDung : dsND) {
			if(nguoiDung.getSoCMND() == timCMND) {
				System.out.println("--------------------------------------");
				System.out.println("Đã tìm thấy người dùng có số CMND "+timCMND);
				System.out.println("--------------------------------------");
				nguoiDung.inTT();
				
			}
	//		else {
	//			timND();
	////			System.out.println("XXX Không tìm thấy XXX");
	//		}
		}
	}
	//public boolean timNDtheoHT() {
	//	System.out.println("-------------------");
	//	System.out.println("Nhập họ tên cần tìm");
	//	System.out.println("-------------------");
	//	String timHoTen = nhap.nextLine();
	//	for (NguoiDung nguoiDung : dsND) {
	//		if(nguoiDung.getHoTen() == timHoTen) {
	//			nguoiDung.inTTND();
	//			return true;
	//		}else {
	//			System.out.println("Không tìm thấy ");
	//			return false;
	//		}
	//	}
	//	return false;
	//}
	public void danhSachKQXN() {
		menu.menuDanhSachKQXN();
		int lc = nhap.nextInt();
		if(lc == 1 ) {
		danhSachDuongTinh();
		}else if(lc ==2 ) {
		danhSachAmTinh();
		}else if(lc==3) {
			tongSLDuongTinh();
		}else if(lc==4) {
			tongSLAmTinh();
		}
	}
	public void danhSachDuongTinh() {
			System.out.println("~~ Danh Sách Dương Tính ~~");
			for (NguoiDung nguoiDung : dsND) {
					if(nguoiDung.getKqXN().equalsIgnoreCase("Dương tính")){
				nguoiDung.inTT();
			}
			}
		}
	public void danhSachAmTinh() {
			System.out.println("~~ Danh Sách Âm Tính ~~");
			for (NguoiDung nguoiDung : dsND) {
					if(nguoiDung.getKqXN().equalsIgnoreCase("Âm Tính")){
				nguoiDung.inTT();
			}
			}
		}
	public void tongSLDuongTinh() {
		for (NguoiDung nguoiDung : dsND) {
			if(nguoiDung.getKqXN().equalsIgnoreCase("Dương Tính")) {
				soLuongDuongTinh++;
			}
				}
		System.out.println("---------------------------------------");
		System.out.println("Danh sách có: "+soLuongDuongTinh+" người dùng dương tính");
		System.out.println("---------------------------------------");
	
		
	}
	public void tongSLAmTinh() {
		for (NguoiDung nguoiDung : dsND) {
			if(nguoiDung.getKqXN().equalsIgnoreCase("Âm Tính")) {
				soLuongAmTinh++;
			}
				}
		System.out.println("---------------------------------------");
		System.out.println("Danh sách có: "+soLuongAmTinh+" người dùng âm tính");
		System.out.println("---------------------------------------");
		
	}
	public static void main(String[] args) {
		DanhSachNguoiDung dsND = new DanhSachNguoiDung();
		dsND.themND();
		dsND.suaND();
	//	dsND.xoaND();
		dsND.inDSND();
	//	dsND.timNDtheoHT();
	}
}

