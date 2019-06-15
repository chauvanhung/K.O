
//Bai tap Tuan 4 BT2
//Xay dung lop DSHCN 
package BTTuan4;
import java.io.*;
import java.util.Scanner;

class DSHinhChuNhat {
	HinhChuNhat DS[];
	int SL;
	public void NhapDSHCN() {
		Scanner sc = new Scanner(System.in);
		System.out.print("NHAP SO LUONG HCN: ");
		SL = sc.nextInt();
		DS = new HinhChuNhat[SL];
		
		for(int i = 0 ; i < SL ; i++) {
			System.out.println("NHAP HCN:");
			System.out.println(" + Thu " + (i+1)+": ");
			DS[i] = new HinhChuNhat();
			DS[i].NhapHCN();
		}
	}
	public void XuatCVHCN() {
		System.out.println("CHU VI HINH CHU NHAT:");
		for(int i = 0 ; i < SL ; i++) {
			System.out.println(" + Thu " + (i+1) + ":" + DS[i].ChuViHCN());
		}
	}
	public void XuatDTHCN() {
		System.out.println("DIEN TICH:");
		for(int i = 0 ; i < SL ; i++) {
			System.out.println(" + Thu " + (i+1) + ":" + DS[i].DienTichHCN());
	}
	}
}
class Demo2 {
	public static void main (String[] args) {
		DSHinhChuNhat DS = new DSHinhChuNhat();
		DS.NhapDSHCN();
		DS.XuatCVHCN();
		DS.XuatDTHCN();
	}
}