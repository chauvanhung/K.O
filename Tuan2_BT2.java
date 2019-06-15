//ChauVanHung 
//1711062105
//Bai tap Tuan 2 BT2 
//Xay dung lop Mang. Phuong thuc set(), get(), Tinh TTB So le, Max, Sort
import java.io.*;
import java.util.Scanner;

class Test2 {
	private int Number;
	private int Array[];
	private int SizeArray;
	//Get Number
	public int getNumber() {
		return Number;
	} 
	//Set Number
	public void setNumber(int Number) {
		this.Number = Number;
	} 
	//Get Array[i]
	public int getArray(int Index) {
		return Array[Index];
	} 
	//Set Array[i]
	public void setArray(int Index, int Value) {
		this.Array[Index] = Value;
	} 
	//Get Size
	public int getSizeArray() {
		return SizeArray;
	} 
	//Set Size
	public void setSizeArray(int SizeArray) {
		this.SizeArray = SizeArray;
	} 
	//Input Array
	public void InputArrays() {
		Scanner sc = new Scanner(System.in);
	 	System.out.print("Input Size Arrays: ");
        SizeArray = sc.nextInt();
 		System.out.print("Input Number Arrays: ");
        Number = sc.nextInt();
        Array = new int[SizeArray];
        	for(int i = 0; i < Number; i++) {
            	System.out.print("a[" + i + "]: ");
           		Array[i] = sc.nextInt();
        }
	}
     //Output Array
     public void OutputArrays() {
     	System.out.println("YOUR ARRAYS");
     	for(int i = 0 ; i < Number ; i++) {
     		System.out.print(Array[i] + "\t");
     	}
     }
     //Avg Array
     public float AvgArrays() {
     	float Sum = 0;
     	int Count = 0;
     	for(int i = 0 ; i < Number ; i++) {
     		if(Array[i]%2 != 0) {
     			Sum += Array[i];
     			Count++; 
     		}

     	}
     return Sum/Count;
     }
     //Max Array
     public int MaxArrays() {
     	int Max = Array[0];
     	for(int i = 0 ; i < Number ; i++) {
     		if(Max < Array[i])
     			Max = Array[i];
     	}
     return Max;
     }
     //Sort Arrays
     public void SortArrays() {
     	int temp;
     	for(int i = 0 ; i < Number - 1 ; i++)
     		for(int j = i + 1 ; j < Number ; j++)
     			if(Array[i] > Array[j]) {
     				temp = Array[i];
     				Array[i] = Array[j];
     				Array[j] = temp;
     			}
     }
}
class Demo2 {
	public static void main (String[] args) {
		Test2 Arr = new Test2();
		Arr.InputArrays();
		Arr.OutputArrays();
		System.out.println("\nAvg Arrays is:" + Arr.AvgArrays());
		System.out.println("Max Arrays is:" + Arr.MaxArrays());
		System.out.println("Sorting Arrays"); 
		Arr.SortArrays();
		Arr.OutputArrays();
	}	
}

     