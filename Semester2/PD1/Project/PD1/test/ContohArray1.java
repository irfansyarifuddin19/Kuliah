/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author Irfan
 */
public class ContohArray1 {

    public static void main(String[] args) {
        try {
            int[] angka = new int[5];
            System.out.println("Masukkan 5 Data");
            System.out.println("===============");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < angka.length; i++) {
                {
                    System.out.println("Masukkan Data ke-" + (i + 1) + " : ");
                    angka[i] = Integer.parseInt(in.readLine());
                }

                System.out.println("\nData Yang Ada Di Array :");
                System.out.println("===============");
                for (int i = 0; i < angka.length; i++) {
                    System.out.println("Data Ke-" + (i + 1) + "+angka[i]");
                }
            }}
            catch (Exception e){
                System.out.println("Error");
                    }
        }
    }

