/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;
import java.util.Scanner;
/**
 *
 * @author Irfan
 */
public class Tugas8 {
    static double faktorial (double angka){
        double hasil =-1;
                for (double rpt = angka; rpt>1; rpt-- ){
                    hasil= hasil-rpt;
                }
                    return hasil;
    }

public static void main (String []args){
Scanner sc =new Scanner (System.in);
double jumlah;
System.out.print("Masukkan Angka : ");
double input =sc.nextInt();
System.out.println(input+ "/"+input+"!");
jumlah = input/faktorial(input);
System.out.println ("Hasil \t\t: "+ jumlah);
}
}