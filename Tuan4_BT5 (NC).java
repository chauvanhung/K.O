//Bai tap Tuan 4 BT5
//Xay dung lop giai Phuong trinh bac nhat
import java.io.*;
import java.util.Scanner;

class PhuongTrinhBac1{
    private int a,b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public PhuongTrinhBac1() {
        a = b = 0;
    }
    
    public PhuongTrinhBac1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();
    }
    
    public void GiaiPTBac1() {
        if(a == 0)
        {
            if(b == 0)
                System.out.println("- Phuong trinh vo so nghiem");
            else
                System.out.println("- Phuong trinh vo nghiem");
        }
        else
            System.out.println("- Phuong trinh co nghiem: x = " + (float)-b/a);
    }
}
class Bai5 {
    public static void main(String[] args) {
        PhuongTrinhBac1 p = new PhuongTrinhBac1();
        p.Nhap();
        p.GiaiPTBac1();
    }
}
