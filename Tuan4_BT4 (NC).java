
//Bai tap Tuan 4 BT4
//Xay dung lop Tam Giac. Viet cac phuong thuc Tinh CV, DT, Xac dinh loai Tam giac
import static java.lang.Math.sqrt;
import java.util.Scanner;

class TamGiac {

    int C1, C2, C3;
    double ChuVi, DienTich;
    String Loai;

    public TamGiac() {
        C1 = C2 = C3 = 0;
    }

    public TamGiac(int C1, int C2, int C3) {
        this.C1 = C1;
        this.C2 = C2;
        this.C3 = C3;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh 1: ");
        C1 = sc.nextInt();
        System.out.print("Nhap canh 2: ");
        C2 = sc.nextInt();
        System.out.print("Nhap canh 3: ");
        C3 = sc.nextInt();
    }

    public void KiemTra() {
        if ((C1 + C2 < C3) || (C2 + C3 < C1) || (C3 + C1 < C2) || (C1 <= 0) || (C2 <= 0) || (C3 <= 0)) {
            do {
                System.out.println("Tam giac nhap sai. Nhap lai!");
                NXhap();
            }
            while ((C1 + C2 < C3) || (C2 + C3 < C1) || (C3 + C1 < C2) || (C1 <= 0) || (C2 <= 0) || (C3 <= 0));
        }
        else 
            System.out.println("Tam giac hop le");
    }

    public void TinhCV_DT() {
        ChuVi = (C1 + C2 + C3);
        DienTich = sqrt(ChuVi / 2 * (ChuVi / 2 - C1) * (ChuVi / 2 - C2) * (ChuVi / 2 - C3));
        if (C1 == C2 && C2 == C3)
        {
            Loai = "Tam giac deu";
        } else 
        	if (C1 == C2 || C2 == C3 || C3 == C1) 
	        {
	            if (C1 * C1 + C2 * C2 == C3 * C3 || C2 * C2 + C3 * C3 == C1 * C1 || C3 * C3 + C1 * C1 == C2 * C2)
	            {
	                Loai = "Tam giac vuong can";
	            } else {
	                Loai = "Tam giac can";
	            }
	        } else 
	        	if (C1 * C1 + C2 * C2 == C3 * C3 || C2 * C2 + C3 * C3 == C1 * C1 || C3 * C3 + C1 * C1 == C2 * C2)
		        {
		            Loai = "Tam giac vuong";
		        } else {
		            Loai = "Tam giac thuong";
		        }
    }

    public void Xuat() {
        System.out.print("Chu vi: " + ChuVi);
        System.out.print("\nDien tich: " + DienTich);
        System.out.println("\nLoai: " + Loai);
    }
}

class Bai4 {
    public static void main(String[] args) {
        TamGiac tg = new TamGiac();
        tg.Nhap();
        tg.KiemTra();
        tg.TinhCV_DT();
        tg.Xuat();
    }
}
