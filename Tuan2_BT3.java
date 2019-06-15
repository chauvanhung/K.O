//ChauVanHung
//1711062195
//Xay dung lop Danh sach hoc sinh                                                                                                                                                  
import java.io.*;
import java.util.Scanner;

class Test3 {
	private Student ST[];
	private int Number;
	Scanner sc = new Scanner(System.in);		
	public void InputStudent() {

		System.out.print("Input Number Student: ");
		Number = sc.nextInt();
		ST = new Student[Number];
		for(int i = 0; i < Number; i++) {
            System.out.println("- Input Student Pos " + (i+1) +":");
            ST[i] = new Student();
            ST[i].Input();
        }
	}
	public void OutputStudent() {
		System.out.println("INFORMATION CLASS STUDENT");
		for(int i = 0 ; i < Number ; i++) {
			ST[i].Output();
		}
	}

  	public void Sorting(){
        Student temp;
        for(int i = 0; i < Number - 1; i++)
            for(int j = i + 1; j < Number; j++)
                if(ST[i].getAvgPoint() > ST[j].getAvgPoint()){
                    temp = ST[i];
                    ST[i] = ST[j];
                    ST[j] = temp;
                }
    }
}

class Demo3 {
	public static void main (String[] args) {
		Test3 st = new Test3();
		st.InputStudent();
		st.OutputStudent();
		st.Sorting();
		System.out.println("SORTING CLASS STUDENT TO AVG POINT");		
		st.OutputStudent();
	}
}