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
public class Daduanjay {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Masukkan Prediksi Anda: ");
        int predict =sc.nextInt();
        int dadu1= new Random().nextInt(6) + 1;
        int dadu2= new Random().nextInt(6) + 1;
        int jumlahdadu=dadu1=dadu2;
        if ((predict > 0) && (predict<=12)){
        if(predict==jumlahdadu){
            System.out.println("Selamat... tebakan Anda benar!");
        }
        else if(predict !=jumlahdadu){
        System.out.println("Maaf, Anda belum beruntung. Hasil guliran dua dadu adalah "+jumlahdadu);
        }
    }
        else 
        System.out.println("Inputan Anda Salah , Silahkan Coba Lagi ");
        
    }
}