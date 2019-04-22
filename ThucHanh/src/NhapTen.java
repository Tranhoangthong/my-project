import java.util.Scanner;

public class NhapTen {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Nhap a: 	");
		int a1 = input.nextInt();
		System.out.println("Nhap b: 	");
		int b1 = input.nextInt();
		System.out.println(" A+B : "+ (a1+b1));
		System.out.println(" A-B : "+ (a1-b1));
		System.out.println(" A/B : "+ (a1/b1));
		System.out.println(" A++ : "+ (++a1));
		System.out.println(" B-- : "+ (b1));
		
		if(a1>b1) {
			System.out.println("A>B");}
		else {
			System.out.println("a<=b");
		}
		}
		
	

	

	

}
