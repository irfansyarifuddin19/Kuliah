/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6latihan;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author samcro
 */
public class Modul6Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputku = new Scanner(System.in);
        int[] nrp = new int[5];
        int[] tugas = new int[5];
        int[] uts = new int[5];
        int[] uas = new int[5];
        double[] na = new double[5];
        String[] grade = new String[5];
        String[] label = {"NRP","TUGAS","UTS","UAS","NA","Grade"};
        
        int x;
        
        for(x = 0; x < nrp.length; x++){
            System.out.println("Input NRP: ");
            nrp[x] = inputku.nextInt();
            System.out.println("Input Tugas: ");
            tugas[x] = inputku.nextInt();
            System.out.println("Input UTS: ");
            uts[x] = inputku.nextInt();
            System.out.println("Input UAS: ");
            uas[x] = inputku.nextInt();
            
            na[x] = (tugas[x]*0.1)+(uts[x]*0.3)+(uas[x]*0.6);
            
            if(na[x] >= 80 && na[x] <= 100){
                grade[x] = "A";
            }else if(na[x] >= 70 && na[x] < 80){
                grade[x] = "B";
            }else if(na[x] >= 56 && na[x] < 70){
                grade[x] = "C";
            }else if(na[x] >= 44 && na[x] < 56){
                grade[x] = "D";
            }else if(na[x] >= 0 && na[x] < 44){
                grade[x] = "E";
            }
        }
        
        System.out.println(Arrays.toString(label));
        for(x = 0; x < nrp.length; x++){
            System.out.print(nrp[x]+", "+tugas[x]+", "+uts[x]+", "+uas[x]+", "+na[x]+", "+grade[x]);
            System.out.println("");
        }
    } 
}
