import java.util.Scanner;

import jsp.example.b3.Emlployee;

public class Snippet {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Nhap so:");
		int a1 = input.nextInt();
		Emlployee e = new Emlployee(); 
		switch (a1) {
		case 1:
			
			break;
		case 2 :
			System.out.println("Danh sach nhan vien");
			break;
		case 3 :
			System.out.println("Thoat");
			break;
	

		default:
			System.out.println("Khong hop le");
			
		}
		
				}
}