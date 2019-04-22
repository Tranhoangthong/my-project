/**
 * 
 */
package jsp.example.b3;
import java.util.Scanner;
/**
 * @author Admin
 *
 */
public class Emlployee {
	Scanner scanner = new Scanner(System.in);
		protected String name;
		protected int id;
		protected double Salary;
		protected int Age;
		protected boolean Married;
		protected Job job;
		
	public Emlployee(String name , int id , double Salary , int Age , boolean Married , Job job ){
		this.name = name;
		this.id = id;
		this.Salary = Salary;
		this.Age = Age;
		this.Married = Married ;
		this.job = job;
		}
	public void nhap() {
		
		System.out.println("ten nhan vien: ");
		name = scanner.nextLine();
		System.out.println("ma nhan vien: ");
		id = scanner.nextInt();
		System.out.println("Muc luong : ");
		Salary = scanner.nextDouble();
		System.out.println("Tuoi: ");
		Age = scanner.nextInt();
		System.out.println("Married: ");
		Married = scanner.nextBoolean();
		
		
		
		
	}

	
	
}
