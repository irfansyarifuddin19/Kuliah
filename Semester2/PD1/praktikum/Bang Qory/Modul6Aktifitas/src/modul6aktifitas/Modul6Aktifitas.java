/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6aktifitas;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author samcro
 */
public class Modul6Aktifitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputku = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        
        int x, j;
        float average = 0;
        
        for(x =0; x < array1.length; x++){
            System.out.println("Input angka "+(x+1));
            array1[x] = inputku.nextInt();
            average += array1[x];
        }
        
        System.out.println("Sebelum diurutkan: "+Arrays.toString(array1));
        
        for (x = 0; x < array1.length; x++) {
            for (j = x + 1; j < array1.length; j++) {
                int tmp;
                if (array1[x] > array1[j]) {
                    tmp = array1[x];
                    array1[x] = array1[j];
                    array1[j] = tmp;
                }
            }
        }
        
        for (x = 0; x < array1.length; x++) {
            array2[x] = array1[x];
        }
        
        System.out.println("Setelah diurutkan: "+Arrays.toString(array2));
        System.out.println("Terkecil: "+array2[0]+" dan Terbesar: "+array2[9]);
        System.out.println("Rata-rata: "+average/array1.length);
    }
}
