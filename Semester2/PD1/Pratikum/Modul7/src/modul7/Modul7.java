/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7;
import java.util.Scanner;
/**
 *
 * @author Irfan
 */
public class Modul7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc =new Scanner(System.in);
    int i, j, kolom, baris; 
    
    kolom =3;
    baris =5;

    int [][] a =new int [kolom][baris];
    
        System.out.println("Input Angka");
        for (i=0; i<3;i++){
            for (j=0; j<5; j++){
        a[i][j]= sc.nextInt();
            }
            System.out.println();
        }
    for ( i=0; i<a.length; i++){
        for(j=0; j<a[i].length; j++){
            System.out.print(a[i][j]+"\t");
    }
        System.out.println();
}}
}