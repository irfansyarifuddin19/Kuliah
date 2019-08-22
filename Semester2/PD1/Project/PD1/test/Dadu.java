/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Irfan
 */
public class Dadu {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan tebak anda [2-12]: ");
    int tebakan=sc.nextInt();
    
    
    if((tebakan > 0)&& (tebakan<=12)){
        Dadu td = new Dadu();
        int hasilGuliran = td.gulirDuaDadu();
        
        if(tebakan == hasilGuliran)
            System.out.println("Hebat...tebakan anda benar!!!");
        else{
            System.out.println("Maaf, anda belum beruntung");
            System.out.println("Hasil guliran dua dadu adalah "+hasilGuliran);
        }
    }
    else
        System.out.println("Anda memasukan bilangan yang invalid!!!");
        
    }
    int gulirDuaDadu(){
    int dadu1, dadu2, jumlahDuaDadu;
    dadu1=1+(int)new Random().nextInt(6)+1;
    dadu2=1+(int)new Random().nextInt(6)+1;
    jumlahDuaDadu=dadu1+dadu2;
    return jumlahDuaDadu;
}
}