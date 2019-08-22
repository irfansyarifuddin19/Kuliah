import java.util.Scanner;

public class latihan {

	public static void main(String[] args) {
		
	//	System.out.println("+--------+--------+--------+--------+-------+--------+");
	//	System.out.println("|  NRP   | Tugas  |  UTS   |  UAS   |Nilai_A|  Grade |");
	//	System.out.println("+--------+--------+--------+--------+-------+--------+");

		do {
			{

				Scanner sc = new Scanner(System.in);

				System.out.println("+----------+--------+--------+--------+");
				System.out.println("|  NRP     | Tugas  |  UTS   |  UAS   |");
				System.out.println("+----------+--------+--------+--------+");
				System.out.print("|");
				int NRP = sc.nextInt();
				int TUGAS = sc.nextInt();
				int UTS = sc.nextInt();
				int UAS = sc.nextInt();
				System.out.println("+----------+--------+--------+--------+");

				

				double na;
				char grade;
				String context;

				na = TUGAS*0.1 + UTS*0.3 + UAS*0.6;

				if (na >= 80 && na <= 100) {
					grade = 'A';
					if (na == 100) {
						context = "SEMPURNA";
					} else {
						context = "LULUS";
					}
				} else if (na >= 70) {
					grade = 'B';
					context = "LULUS";
				} else if (na >= 56) {
					grade = 'C';
					context = "LULUS";
				} else if (na >= 44) {
					grade = 'D';
					context = "GAGAL";
				} else {
					grade = 'E';
					context = "PARAH";
				}


				System.out.println("+----------+--------+--------+--------+-------+--------+----------+");
				System.out.println("|  NRP     | Tugas  |  UTS   |  UAS   |Nilai_A|  Grade |  Context |");
				System.out.println("+----------+--------+--------+--------+-------+--------+----------+");
				System.out.println("|"+ NRP  +" |  "+TUGAS+"    |   "+UTS+"   |   "+UAS+"   |  "+na+" |   "+grade+"    |    "+context+" |");
				System.out.println("+----------+--------+--------+--------+-------+--------+----------+");


				System.out.println("---------------------------------------");
				
				System.out.print("Ulang program ? (y/n) : ");
				int jawab = sc.nextInt();

			} 
		} while (jawab != 1000);
		

	}
	
}