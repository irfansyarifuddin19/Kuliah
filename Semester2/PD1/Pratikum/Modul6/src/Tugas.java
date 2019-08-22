 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.util.Scanner;
 /**
 *
 * @author Irfan
 */
 public class Tugas {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 int[] kodePegawai = new int[5];
 int[] lamaBekerja = new int[5];
 int[] jumAnak = new int[5];
 int[] insentif = new int[5];
 int[] gajiPokok = new int[5];
 int[] total = new int[5];
 int x;

 for(x = 0; x < kodePegawai.length; x++){
 System.out.println("Input Kode Pegawai: ");
 kodePegawai[x] = sc.nextInt();
 System.out.println("Input Lama Bekerja: ");
 lamaBekerja[x] = sc.nextInt();
 System.out.println("Input Jumlah Anak: ");
 jumAnak[x] = sc.nextInt();

 if(lamaBekerja[x] >= 0 && lamaBekerja[x] <= 5){
 gajiPokok[x] += 1000000;
 }else if(lamaBekerja[x] > 5 && lamaBekerja[x] <= 10){
 gajiPokok[x] += 2000000;
 }else if(lamaBekerja[x] > 10){
 gajiPokok[x] += 5000000;
 }

 if(jumAnak[x] > 0 && jumAnak[x] <= 2){
 total[x] += (200000*jumAnak[x]);
 }
 else if(jumAnak[x] > 2){
 total[x] += (200000*2); 
 }

 if(jumAnak[x] >= 2 && lamaBekerja[x] > 2){
 insentif[x] = 300000; 
 }

 total[x] = total[x] + gajiPokok[x] + insentif[x];

 }

 System.out.println("|Kode Pegawai \t|Lama Bekerja \t|Jumlah Anak \t|Insentif \t|Gaji Pokok \t|Total Gaji\t|");

 for(x = 0; x < kodePegawai.length; x++){
 System.out.print("|"+kodePegawai[x]+"\t\t|"+lamaBekerja[x]+"\t\t|"+jumAnak[
x]+"\t\t|"+insentif[x]+"\t\t|"+gajiPokok[x]+"\t|"+total[x]+"\t|");
 System.out.println("");
 }
 }
 } 