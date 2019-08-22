import java.util.Scanner;

public class uts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	//	do {

			System.out.print("UTS \t\t: ");
			double UTS = sc.nextDouble();
			System.out.print("UAS \t\t: ");
			double UAS = sc.nextDouble();
			System.out.print("Tugas 1 \t: ");
			double Tugas1 = sc.nextDouble();
			System.out.print("Tugas 2 \t: ");
			double Tugas2 = sc.nextDouble();

			double TugasT, Nilai_Akhir;

			if (Tugas1 >= Tugas2) {
				
				TugasT = Tugas1;

			} else {

				TugasT = Tugas2;

			}

			Nilai_Akhir = TugasT*0.3 + UTS*0.3 + UAS*0.4;

			System.out.println("Nilai Akhir : " + Nilai_Akhir);

			char grade;
			String context;

			if (Nilai_Akhir <= 100 && Nilai_Akhir >= 0) {
			
				if (Nilai_Akhir >= 80) {
			
					grade = 'A';
					context = 'Memuaskan';
					System.out.println("Grade : " + grade);
					
				} else if (Nilai_Akhir >= 70) {

					grade = 'B';
					context = 'Bagus';
					System.out.println("Grade : " + grade);

				} else if (Nilai_Akhir >= 56) {
							
					grade = 'C';
					context = 'Cukup'
					System.out.println("Grade : " + grade);

				} else if (Nilai_Akhir >= 44) {
								
					grade = 'D';
					context = 'Kurang';
					System.out.println("Grade : " + grade);

				} else {

					grade = 'E';
					context = 'Gagal';
					System.out.println("Grade : " + grade);

				}


			} else {

				System.out.println("Nilai Error");
			
			}


		/**	switch (grade) {
			
				case 'A':
					System.out.println("Memuaskan");
					break;

				case 'B':
					System.out.println("Bagus");
					break;

				case 'C':
					System.out.println("Cukup");
					break;

				case 'D':
					System.out.println("Kurang");
					break;

				default:
					System.out.println("Gagal");
					break;

		}  **/

		//	char inputout = 'y';
			
	//	} while (inputout == 'y');

	}
	
}