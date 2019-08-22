/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;

/**
 *
 * @author Irfan
 */
public class Nomer1 extends hitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hasil Dari Menghitung Segitiga SIku-Siku "+(ngitung()));
        
    }

}

class hitung {

   static double ngitung() {
        int a = 4, b = 3;
        int c = ((a * a) + (b * b));
        return Math.sqrt(c) ;
    }

}
