/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author Irfan
 */
import java.util.Scanner;

public class pangkad {

    public static void main(String[] args) {
        int x, y;
        int hasil = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan x: ");
        x = sc.nextInt();
        System.out.println("masukkan y: ");
        y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            hasil = hasil * x;
        }
        System.out.println("hasilnya " + hasil);
    }
}
