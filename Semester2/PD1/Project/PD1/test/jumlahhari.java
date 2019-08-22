/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
public class jumlahhari {

    public static void main(String[] args) {
        int[] JumlahHari;
        JumlahHari = new int[12];

        JumlahHari[0] = 31;

        for (int i = 0; i <= 12; i++) {
            if (i % 2 == 0) {
                System.out.println("JumlahHari [" + i + "] = 30");

            } else {
                System.out.println("JumlahHari [" + i + "] = 31");
            }
        }
    }

}
