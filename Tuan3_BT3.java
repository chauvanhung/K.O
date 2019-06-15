
//Bai tap Tuan 3 BT3 
//Tao lop COODINATE (Toa do diem trong khong gian 2 chieu Oxy)
import java.util.Scanner;

class Coodinate {

    private float Tung, Hoanh;

    public Coodinate() {
        Tung = Hoanh = 0;
    }

    public Coodinate(float Tung, float Hoanh) {
        this.Tung = Tung;
        this.Hoanh = Hoanh;
    }

    public Coodinate(Coodinate t) {
        this.Tung = t.Tung;
        this.Hoanh = t.Hoanh;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoanh do: ");
        Hoanh = sc.nextFloat();
        System.out.print("Nhap tung do: ");
        Tung = sc.nextFloat();
    }

    public void Xuat() {
        System.out.print("(" + Hoanh + ", " + Tung + ")");
    }

    public Coodinate DoiXung() {
        Coodinate dx = new Coodinate();
        dx.Hoanh = -Hoanh;
        dx.Tung = -Tung;
        return dx;
    }
    
    public Coodinate Tong(Coodinate t){
        Coodinate kq = new Coodinate();
        kq.Hoanh = this.Hoanh + t.Hoanh;
        kq.Tung = this.Tung + t.Tung;
        return kq;
    }
}

class Bai3 {
    public static void main (String[] args) {

        Coodinate t = new Coodinate();
        Coodinate t2 = new Coodinate();
        
        System.out.println("Nhap toa do thu 1: ");
        t.Nhap();
        System.out.print("- Toa do 1 vua nhap la: ");
        t.Xuat();
        
        System.out.println("\n\nNhap toa do thu 2: ");
        t2.Nhap();
        System.out.print("- Toa do 2 vua nhap la: ");
        t2.Xuat();
        
        
        System.out.print("\n\n- Tong toa do 1 va toa do 2: ");
        t.Tong(t2).Xuat();
        
        System.out.print("\n- Diem doi xung toa do 1: ");
        t.DoiXung().Xuat();
        System.out.print("\n- Diem doi xung toa do 2: ");
        t2.DoiXung().Xuat();
        System.out.println("");
    }
}
