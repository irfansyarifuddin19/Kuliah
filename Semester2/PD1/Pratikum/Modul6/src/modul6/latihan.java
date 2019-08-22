/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author Irfan
 */
/* 
	 * To change this license header, choose License Headers in Project Properties. 
	 * To change this template file, choose Tools | Templates 
	 * and open the template in the editor. 
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Irfan
 */
public class latihan {

    public static void main(String[] args) {
        int[] nilaiuts = new int[5];
        int[] nilaitugas = new int[5];
        int[] nilaiuas = new int[5];
        int[] nrp = new int[5];
        String[] grade = new String[5];
        double[] nilaiakhir = new double[5];
        String[] label ={"NRP","TUGAS","UT","UAS","NA","Grade"};
        Scanner sc = new Scanner(System.in);
                
                
         int a ;
         for (a = 0; a < nrp.length; a++){
        System.out.println("Masukkan NRP Anda: ");
        nrp[a]= sc.nextInt();
            System.out.print("Masukkan Nilai UTS Anda: ");
            nilaiuts[a] = sc.nextInt(); //0.3  
            System.out.print("Masukkan Nilai Tugas Anda: ");
            nilaitugas[a] = sc.nextInt(); //0.2  
            System.out.print("Masukkan Nilai UAS Anda: ");
            nilaiuas[a] = sc.nextInt();//0.5  
             nilaiakhir[a] = (nilaitugas[a] * 0.1) + (nilaiuts[a] * 0.3) + (nilaiuas[a] * 0.6);
            if ((nilaiakhir[a] >= 80) && (nilaiakhir[a] <= 100)) {
                grade[a] = "A";
            } else if ((nilaiakhir[a] >= 70) && (nilaiakhir[a] < 80)) {
                grade[a] = "B";
            } else if ((nilaiakhir[a] >= 56) && (nilaiakhir[a] < 70)) {
                grade[a] = "C";
            } else if ((nilaiakhir[a] >= 44) && (nilaiakhir[a] < 56)) {
                grade[a] = "D";
            } else if ((nilaiakhir[a] >= 0) && (nilaiakhir[a] < 44)) {
                grade[a] = "E";
            }} 
            System.out.println(Arrays.toString(label));
            for(a = 0; a < nrp.length; a++){
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("|\t\tNRP\t|\tTugas\t|\tUTS\t|\tUAS\t|\tNilai Akhir\t|\tGrade\t|");
            System.out.println("|\t " + nrp[a] + "\t|\t" + nilaitugas[a] + "\t|\t" + nilaiuts[a] + "\t|\t" + nilaiuas[a] + "\t|\t" + nilaiakhir[a] + "\t\t|\t" + grade[a] + "\t|");
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
        }
    }
}
