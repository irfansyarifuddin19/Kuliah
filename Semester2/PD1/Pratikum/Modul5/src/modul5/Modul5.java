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
public class Modul5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        Scanner sc= new Scanner (System.in);
        System.out.println("Masukkan Angka ea");
        int N= sc.nextInt();
 
        for (i=1;i<N;i++){
            if (i%3==0 || i%5==0 ){
                System.out.println(i);
            }
        }
    
}
}