/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Irfan
 */
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long f = 1;
        int a=0;
        System.out.println("Masukkan angka: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            f = i * f;
        }
        System.out.println("faktorial dari " + a + " adalah " + f);
    }

}
