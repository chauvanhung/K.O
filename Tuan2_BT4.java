//Bai tap Tuan 2 BT4
//Tao danh sach doi tuong hoc sinh. Nhap - Xuat
package BTTuan2;
import java.io.*;
import java.util.Scanner; 
 
class Test4 {
    public static void main(String[] args) {
        Student[] ListST = new Student[5];
        int Number;
        System.out.print("Input Number Student: ");
        Scanner sc = new Scanner(System.in);
        Number = sc.nextInt();
        for(int i = 0; i < Number; i++){
            System.out.println("- Input Student Pos " + i +":");
           	ListST[i] = new Student();
            ListST[i].Input();
        }
        System.out.println("---INFORMATION STUDENT---:");
        for(int i = 0; i < Number; i++)
            ListST[i].Output();
    }
}