/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5tugas;
import java.util.Scanner;

/**
 *
 * @author samcro
 */
public class Modul5Tugas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputku = new Scanner(System.in);
        int nilai;
        
        do{
            System.out.println("Input nilai anda: ");
            nilai = inputku.nextInt();
            if (nilai == 100){
                System.out.println("SEMPURNA");
            }
            else if (nilai >= 56 && nilai < 100){
                System.out.println("LULUS");
            }
            else if (nilai > 0 && nilai < 56){
                System.out.println("GAGAL");
            }
            else if (nilai == 0 ){
                System.out.println("PARAH");
            }
        }while (nilai != 1000);  
    }   
}
