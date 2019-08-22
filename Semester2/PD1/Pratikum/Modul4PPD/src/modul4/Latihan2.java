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
public class Latihan2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        for (int i = 1; i <= 5; i++) {
            for (int c = 1; c <= i; c++) {
                System.out.print(a + " ");
            }
            a += b;
            System.out.println(" ");
            b += 10;
        }
    }
}
