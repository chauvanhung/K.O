
//Bai tap Tuan 6 BT1 
//Viet chuong trinh khoi tao mot so doi tuong gom: 1 hoc vien, 2 nhan vien. Xuat thong tin cua cac doi tuong
package BTTuan6;
import java.io.*;
import java.util.Scanner;

class CONNGUOI {
	String HoTen;
	int NamSinh;
	
	public CONNGUOI() {
		HoTen = null;
		NamSinh = 0;
	}
	
	public CONNGUOI(String HoTen, int NamSinh) {
		this.HoTen = HoTen;
		this.NamSinh = NamSinh;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ho Ten:");
		HoTen = sc.nextLine();
		System.out.print("Nhap Nam Sinh:");
		NamSinh = sc.nextInt();
	}
	
	public void Xuat() {
		System.out.println(" + Ho va ten: " + HoTen + "\n" + " + Nam Sinh: " + NamSinh);
	}
}

class HOCVIEN extends CONNGUOI{
	float Diem1, Diem2, Diem3;
	
	public HOCVIEN() {
		super();
		Diem1 = Diem2 = Diem3 = 0.0f;
	}
	
	public HOCVIEN(String HoTen, int NamSinh, float Diem1, float Diem2, float Diem3) {
		super(HoTen,NamSinh);
		this.Diem1 = Diem1;
		this.Diem2 = Diem2;
		this.Diem3 = Diem3;
	}
	
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Diem 1: ");
		Diem1 = sc.nextFloat();
		System.out.print("Nhap Diem 2: ");
		Diem2 = sc.nextFloat();
		System.out.print("Nhap Diem 3: ");
		Diem3 = sc.nextFloat();
	}
	
	public void Xuat() {
		super.Xuat();
		System.out.println(" + Diem 1: " + Diem1 + "\n" + " + Diem 2: " + Diem2 + "\n" + " + Diem 3: " + Diem3);
	}
}
class PHONGBANKHOA {
	String MaPBK;
	String TenPBK;
	
	public PHONGBANKHOA() {
		MaPBK = TenPBK = null;
	}
	
	public PHONGBANKHOA(String MaPBK, String TenPBK) {
		this.MaPBK = MaPBK;
		this.TenPBK = TenPBK;
	}
	
	public PHONGBANKHOA(PHONGBANKHOA PBK) {
		this.MaPBK = PBK.MaPBK;
		this.TenPBK = PBK.TenPBK;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ma Khoa: ");
        MaPBK = sc.nextLine();
        System.out.print("Nhap Ten Khoa: ");
        TenPBK = sc.nextLine();
	}
	
	public void Xuat() {
        System.out.println(" + Ma Khoa: " + MaPBK);
        System.out.println(" + Ten Khoa: " + TenPBK);
    }
}

class NHANVIEN extends CONNGUOI {
	double Luong;
	String NgayNhanViec;
	PHONGBANKHOA PBK = new PHONGBANKHOA();
	
	public NHANVIEN() {
		super();
		Luong = 0;
		NgayNhanViec = null;
	}
	
	public NHANVIEN(String HoTen, int NamSinh, double Luong, String NgayNhanViec, PHONGBANKHOA PBK) {
    	super(HoTen, NamSinh);
        this.Luong = Luong;
        this.NgayNhanViec = NgayNhanViec;
        this.PBK = PBK;
	}
	
 	public void Nhap() {
 		super.Nhap();
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Nhap Luong: ");
 		Luong  = sc.nextDouble();
 		System.out.print("Nhap Ngay Lam Viec: ");
 		sc.nextLine();
 		NgayNhanViec = sc.nextLine();
 		PBK.Nhap();	
 	}
 	
 	public void Xuat() {
 		super.Xuat();
 		System.out.println(" + Luong: " + Luong + "\n" + " + Ngay Nhan Viec: " + NgayNhanViec);
 		PBK.Xuat();
 	}
}

class Demo {
	public static void main (String[] args) {	
	/*	HOCVIEN HV = new HOCVIEN();
		HV.Nhap();
		HV.Xuat();
	
	*/	NHANVIEN NV = new NHANVIEN();
		NV.Nhap();
		System.out.println("XUAT THONG TIN NHAN VIEN");
		NV.Xuat();
		
	}
}