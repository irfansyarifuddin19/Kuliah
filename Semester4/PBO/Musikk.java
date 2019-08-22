/* Project      : UAS
 * File         : UAS_Pradipta
 * Tile         : Pelatihan Musik
 * Deskripsi    : system untuk memasukkan data, menghitung sekaligus menampilkan data-data yang terkait.
 */

import java.util.Scanner;

class Musik {

    private int minuman;
    private int roti;
    private int apel;
    private int JmlhPeserta;

    public void BeriMakanan(int makan) {
        makan = roti / JmlhPeserta;
        apel = 1;
    }

    public void BeriMinuman(int minum) {
        minum = 1;
    }

    public void JmlSisaPersediaan(int minum, int apel) {
        minum = 8 - JmlhPeserta;
        apel = 3 - JmlhPeserta;
    }
}

class Peserta {

    static int JmlPeserta;
    static String nama;
    static String JK;
    private String[][] peserta;

    static void InputDataPeserta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah peserta : ");
        JmlPeserta = sc.nextInt();
        for(int i=0; i<JmlPeserta; i++){
            System.out.print("Manukkan Nama peserta "+(i+1)+"   : ");
            nama = sc.next();
            System.out.print("Manukkan Jenis kelamin peserta (P/W) "+(i+1)+"  : ");
            JK = sc.next();
        }
    }
    public int setPeserta(int peserta){
        this.jmpeserta= JmlPeserta;
        return setPeserta;
    }
}

public class Musikk {

    public static void main(String[] args) {
        Peserta.InputDataPeserta();
    }

}