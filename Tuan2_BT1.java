//ChauVanHung
//1711062195
//Bai tap Tuan 2 BT1
//Tao lop Hoc Sinh
package BTTuan2;
import java.io.*;
import java.util.Scanner;

class Student {
	private String MaSo;
	private String HoTen;
	private float DiemTB;
	
	//Get MaSo
	public String getMaSo() {
		return ID;
	} 
	//Set MaSo
	public void setMaSo(String MaSo) {
		this.MaSo = MaSo;
	} 
	//Get HoTen
	public String getHoTen() {
		return HoTen;
	} 
	//Set HoTen
	public void setHoTen(String HoTen) {
		this.HoTen = HoTen;
	} 	
	//Get DiemTB
	public float getDiemTB() {
		return DiemTB;
	} 
	//Set DiemTB
	public void setDiemTB(float DiemTB) {
		this.DiemTB = DiemTB;
	} 
	public void Rank() {
		if(DiemTB >= 8)
			System.out.println("Xep loai Gioi");
		else if(DiemTB >=6.5)
			System.out.println("Xep loai Kha");
			else if(DiemTB >=5)
				System.out.println("Xep loai Trung binh");
				else
					System.out.println("Xep loai yeu");
	}
	public void Input() {
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap ma so:")
		MaSo = x.nextLine(); 
		System.out.print("Nhap ho ten:");
		HoTen = x.nextLine();
		System.out.print("Nhap diem trung binh:");
		DiemTB = x.nextFloat(); 
		}
	public void Output() {
		System.out.println("Thong tin sinh vien");
		System.out.println("Ma so: " + MaSo);
		System.out.println("Ho ten: " + HoTen);
		System.out.println("DiemTB: " + DiemTB);				
	}
}

class Demo1 {
	public static void main (String[] args) {
		Scanner x = new Scanner(System.in);
		Student st = new Student();
		st.Input();
		st.Output();
		st.Rank();
		System.out.print("Input New Student: ");
		String NewStudent = x.nextLine();
		st.setHoTen(NewStudent);
		System.out.println("Ho ten hoc sinh sau khi sua:" + st.HoTen());
	}
}