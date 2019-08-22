/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import java.util.Scanner;

/**
 *
 * @author Irfan
 */
public class Faktor {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya:");
        int tambah = 0;
        for (int z = 0; z <= nilai; z++) {
            tambah++;
            if (nilai % tambah == 0) {
                System.out.println(tambah+ " ");
            }
        }
    }
}
