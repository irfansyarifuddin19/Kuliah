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
public class quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan N: ");
        double N = sc.nextDouble();

        if (N <= N) {
            System.out.println("F: " + Math.round(N));
            System.out.println("C: "+ (Math.round(N)+1));
        } else if (N >= N) {
            System.out.println("F: "+ Math.round(N));
            System.out.println("C: "+(Math.round(N)-1));
        }
    }

}
