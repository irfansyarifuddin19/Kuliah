/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;
import java.util.Scanner;
/**
 *
 * @author Irfan
 */
public class chill {
    public static void main(String[] args) {
                int uts;
                int tugas;
                int uas;
                int nrp;
                double na;
                char grade=0;
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan NRP Anda: ");
                nrp = sc.nextInt();
                if (nrp == 0){
                    System.out.println("");
                }else{
                System.out.print("Masukkan Nilai UTS Anda: ");
                uts = sc.nextInt(); //0.3
                System.out.print("Masukkan Nilai Tugas Anda: ");
                tugas = sc.nextInt(); //0.2
		System.out.print("Masukkan Nilai UAS Anda: ");
                uas = sc.nextInt();//0.5
		na=(tugas*0.1)+(uts*0.3)+(uas*0.6);
		if ((na >=80)&&(na <=100)){
			grade = 'A';
                }else if ((na>=70)&&(na<80)){
	   		grade = 'B';
		}else if ((na>=56)&&(na<70)){
			grade = 'C';
		}else if ((na>=44)&&(na<56)){
			grade = 'D';
		}else {
			grade = 'E';
		}
                    System.out.println("NRP : " +nrp);
                    System.out.println("Nilai Tugas : " +tugas);
                    System.out.println("Nilai UTS : " +uts);
                    System.out.println("Nilai UAS : " +uas);
                    System.out.println("Nilai Akhir : " +na);
                    System.out.println("Grade :" +grade);
        }
    }	
}
   
    

