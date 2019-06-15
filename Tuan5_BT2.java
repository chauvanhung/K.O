
//Bai tap Tuan 5 BT2 
//Xay dung lop DS Hang hoa. Su dung menu chuc nang (Switch - Case)
package BTTuan5;
import java.io.*;
import java.util.Scanner;

class DSHH {
		HangHoa DS[];
		int SL;
		
		public DSHH() {
			SL = 0;
			DS = new HangHoa[100];
		}
		
		/*C1: public void ThemMH(byte Loai) {
			if(Loai == 1) {
				DS[SL] = new HangDM();
				DS[SL].NhapHH();
			}
			else {
				DS[SL] = new HangTP();
				DS[SL].NhapHH();	
			}	
			SL++;
		}*/
		//C2	
			public void ThemMH(HangHoa h)
		{
			if(h instanceof HangDM)
			{
				DS[SL] = new HangDM();
				DS[SL].NhapHH();
			}
			else { 
				DS[SL] = new HangTP();
				DS[SL].NhapHH();
			}
		}

		public void XuatMH(byte Loai) {
			if(Loai == 1) {
				for(int i = 0 ; i < SL ; i++) {
					if(DS[i] instanceof HangDM) {
						DS[i].XuatHH();
					}
				}
			}
			else {
				for(int i = 0 ; i < SL ; i++) {
					if(DS[i] instanceof HangTP) {
						DS[i].XuatHH();
					}
				}
			}
		}
}
class Demo4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		byte Chon;
		DSHH DS = new DSHH();
		do {
			System.out.println("------------MENU------------");
			System.out.println("1: Them mot mat hang vao danh sach");
			System.out.println("2: Xuat mat hang theo loai");
			System.out.println("0: Thoat");
			System.out.print("Moi ban chon Menu: ");
			Chon = sc.nextByte();
			sc.nextLine();
			switch(Chon) {
				case 1: {
					System.out.println("NHAP DANH SACH HANG HOA");
					System.out.println(" + 1: Nhap Hang Dien May " + "\n" + " + 2: Nhap Hang Thuc pham");
					System.out.print("Hay Chon loai mat hang:");
					byte Loai = sc.nextByte();
					HangHoa h;
					if (Loai==1)
						h = new HangDM();
					else
						h = new HangTP();
					DS.ThemMH(h);
					//DS.ThemMH(Loai);
					break;
				}
				case 2: {
					System.out.println("XUAT DANH SACH HANG HOA)");
					System.out.println("+ 1: Nhap Hang Dien May " + "\n" + "+ 2: Nhap Hang Thuc pham");
					byte Loai = sc.nextByte();
					DS.XuatMH(Loai);
					break;
				}
				default: Chon = 0; break;
			}
		}while(Chon!=0);
	}
}