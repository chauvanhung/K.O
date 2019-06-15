
//Bai tap Tuan 5 BT1 
//Phan tich phan cap thua ke cho cac lop (HangDM, HangTP)
package BTTuan5;
import java.io.*;
import java.util.Scanner;

class HangHoa {
	protected String MaHang, TenHang;
	protected long DonGia;
	
	public HangHoa() {
		MaHang = TenHang = null;
		DonGia = 0;
	}
	
	public HangHoa(String MaHang, String TenHang, long DonGia) {
		this.MaHang = MaHang;
		this.TenHang = TenHang;
		this.DonGia = DonGia;	
	}
	
	public void NhapHH() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ma Hang:");
		MaHang = sc.nextLine();
		System.out.print("Nhap Ten Hang:");
		TenHang = sc.nextLine();
		System.out.print("Nhap Don Gia:");
		DonGia = sc.nextLong();		
	}
	
	public void XuatHH() {
		System.out.println(" + Ma Hang: " + MaHang + "\n" + " + Ten Hang: " + TenHang + "\n" + " + Don Gia: " + DonGia);
	}
}

class HangDM extends HangHoa {
	private String TGBH;
	private int DienAp, CongSuat;
	
	public HangDM() {
		super();
		TGBH = null;
		DienAp = CongSuat = 0;
	}
	
	public HangDM(String MaHang, String TenHang, long DonGia, String TGBH, int DienAp, int CongSuat) {
		super(MaHang,TenHang,DonGia);
		this.TGBH = TGBH;
		this.DienAp = DienAp;
		this.CongSuat = CongSuat;
	}
	
	public void NhapHH() {
		System.out.println("NHAP HANG DIEN MAY");
		super.NhapHH();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Thoi gian bao hanh:");
		TGBH = sc.nextLine();
		System.out.print("Nhap Dien ap:");
		DienAp = sc.nextInt();
		System.out.print("Nhap Cong suat:");
		CongSuat = sc.nextInt();		
	}
	
	public void XuatHH() {
		System.out.println("THONG TIN HANG DIEN MAY");
		super.XuatHH();
		System.out.println(" + TGBH: " + TGBH + "\n" + " + Dien Ap: " + DienAp + "\n" + " + Cong Suat: " + CongSuat);		
	}
}
class HangTP extends HangHoa {
	private String NgaySX, NgayHH;
	
	public HangTP() {
		super();
		NgaySX = NgayHH = null;
	}
	
	public HangTP(String MaHang, String TenHang, long DonGia, String NgaySX, String NgayHH) {
		super(MaHang,TenHang,DonGia);
		this.NgaySX = NgaySX;
		this.NgayHH = NgayHH;
	}
	
	public void NhapHH() {
		System.out.println("NHAP HANG THUC PHAM");
		super.NhapHH();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ngay san xuat:");
		NgaySX = sc.nextLine();
		System.out.print("Nhap Ngay het han:");
		NgayHH = sc.nextLine();		
	}
	
	public void XuatHH() {
		System.out.println("THONG TIN HANG THUC PHAM");
		super.XuatHH();
		System.out.println(" + Ngay San Xuat: " + NgaySX + "\n" + " + Ngay Het Han: " + NgayHH);	
	}
}

class Demo {
	public static void main (String[] args) {
		HangDM DM = new HangDM();
		DM.NhapHH();
		DM.NhapHH();
	}
}