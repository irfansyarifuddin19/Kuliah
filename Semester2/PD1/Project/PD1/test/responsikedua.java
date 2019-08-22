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
public class responsikedua {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("1.Luas Persegi Panjang");
        System.out.println("2.Keliling Persegi Panjang");
        System.out.println("3.Panjang Diagonal Persegi Panjang");
        System.out.println("4.Keluar Program");
        System.out.print("Pilihan Anda : ");
        int pilihan = sc.nextInt();
        if(pilihan ==1 ){
        int luas ;
            System.out.print("masukkan panjang = ");    
        int panjang = sc.nextInt();
            System.out.print("masukkan lebar = ");
        int lebar= sc.nextInt();
        luas= panjang*lebar;
           System.out.print("Luas persegi Panjang Adalah "+luas);
        }
        else if (pilihan ==2){
        int keliling ;
            System.out.print("masukkan panjang = ");    
        int panjang = sc.nextInt();
            System.out.print("masukkan lebar = ");
        int lebar= sc.nextInt();
        keliling= 2*(panjang+lebar);
           System.out.print("Keliling Persegi Panjang adalah "+keliling);
        }
        else if(pilihan==3) {
              System.out.print("Masukkan Panjang : ");
              double panjang=sc.nextDouble();
              System.out.print("Masukkan Lebar : ");
              double lebar=sc.nextDouble();
              double diagonal=Math.sqrt(Math.pow(panjang,2)+Math.pow(lebar,2));
              System.out.println("Panjang Diagonal Persegi Panjang adalah "+diagonal+" cm");
        }
        else if (pilihan==4){
            System.out.println("Terimakasih");
        }
        else System.out.println("error");
    }
}