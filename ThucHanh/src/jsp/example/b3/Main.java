package jsp.example.b3;

public class Main {

	public static void main(String[] args) {
		Job job1 = new Job(1,"HR");
		Job job2 = new Job(2,"BA");
		Job job3 = new Job(3,"Tester");
		Job job4 = new Job(4,"Developer");
		Job job5 = new Job(5,"CEO");
		Emlployee emlployee1   = new Emlployee ("Nguyen van A" ,1,3000,25,false,job1);
		Emlployee emlployee2   = new Emlployee ("Nguyen van B" ,2,4000,25,false,job2);
		Emlployee emlployee3   = new Emlployee ("Nguyen van C" ,3,5000,25,false,job3);
		Emlployee emlployee4   = new Emlployee ("Nguyen van D" ,4,6000,25,false,job4);
		Emlployee emlployee5   = new Emlployee ("Nguyen van E" ,5,7000,25,false,job5);
		Emlployee[] emlployees = new Emlployee[5];
	
		emlployees[0]= emlployee1;
		emlployees[1]= emlployee2;
		emlployees[2]= emlployee3;
		emlployees[3]= emlployee4;
		emlployees[4]= emlployee5;
		System.out.println("mang co :" + emlployees.length + " phan tu ");
	
		for (int i=0 ;i<5 ;i++) {
			System.out.println("ten nhan vien la:" +emlployees[i].name);
		}
		 
	}
	
}
