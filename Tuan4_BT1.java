
//Bai tap Tuan 4 BT1 
//Chuong trinh khai bao 1 lop co ten HCN (Chieu dai - Rong). Viet 3 phuong thuc khoi tao va tinh Chu vi va Dien tich
package BTTuan4;
import java.io.*;
import java.util.Scanner;

class HinhChuNhat {
	int Dai, Rong;
	public HinhChuNhat() {
		Dai = Rong = 1;
	} 
	public HinhChuNhat(int HV) {
		Dai  = Rong = HV;
	}
	public HinhChuNhat(int Dai, int Rong) {
		this.Dai = Dai;
		this.Rong = Rong;
	}
	public void NhapHCN() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai:");
		Dai = sc.nextInt();
		System.out.print("Nhap chieu rong:");
		Rong = sc.nextInt();
	}
	public void XuatHCN() {
		System.out.println("Chieu Dai HCN: " + Dai + "\n" + "Chieu Rong HCN: " + Rong);
	}
	public int ChuViHCN() {
		int ChuVi;
		ChuVi = (Dai+Rong)*2;
	return ChuVi;
	}
	public int DienTichHCN() {
		int DienTich;
		DienTich = Dai*Rong;
	return DienTich;
	}
}
class Demo {
 	public static void main (String[] args) {
		HinhChuNhat HCN = new HinhChuNhat();
		HCN.NhapHCN();
		HCN.XuatHCN();
		System.out.println("Chu vi Hinh chu nhat la: " + HCN.ChuViHCN());
		System.out.println("Dien tich Hinh chu nhat la:" + HCN.DienTichHCN());
	}
}