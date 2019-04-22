package jsp.example.b3;
import java.util.Scanner;

import jsp.example.b3.Emlployee;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emlployee e1= new Emlployee(); 
		Scanner input = new Scanner (System.in);
		System.out.println("Nhap so:");
		int a1 = input.nextInt();
	
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
