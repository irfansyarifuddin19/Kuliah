package modul5;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author irfan
 */
public class Mod4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] index1 = new int[10];
        int[] index2 = new int[10];
        
        int a, b;
        float average = 0;
        
        for(a =0; a < index1.length; a++){
            System.out.println("Masukkan Angka ke-"+(a+1));
            index1[a] = sc.nextInt();
            average += index1[a];
        }
        
        System.out.println("Angka sebelum diurutkan: "+Arrays.toString(index1));
        
        for (a = 0; a < index1.length; a++) {
            for (b = a + 1; b < index1.length; b++) {
                int tmp;
                if (index1[a] > index1[b]) {
                    tmp = index1[a];
                    index1[a] = index1[b];
                    index1[b] = tmp;
                }
            }
        }
        
        for (a = 0; a < index1.length; a++) {
            index2[a] = index1[a];
        }
        
        System.out.println("Angka Setelah diurutkan: "+Arrays.toString(index2));
        System.out.println("Terkecil: "+index2[0]+" dan Terbesar: "+index2[9]);
        System.out.println("Rata-rata: "+average/index1.length);
    }
}
