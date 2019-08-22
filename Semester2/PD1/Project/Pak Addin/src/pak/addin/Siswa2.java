/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
class siswa2 {
    String nama ="addin";
    String nim ="12345";
    void isiData (String nama,String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public static void main(String[] args) {
        siswa2 mahasiswa_stiki = new siswa2();
        mahasiswa_stiki.isiData("Aku","081999");
        
                System.out.println ("Nama :"+mahasiswa_stiki.nama);
                System.out.println ("Nim : "+mahasiswa_stiki.nim );
                }
}