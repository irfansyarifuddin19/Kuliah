/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baru;

/**
 *
 * @author Irfan
 */
public class SudahFinal {
    public void fungsiku() {
        System.out.println("Class ini sudah final");
    }
}

class TurunanFinal extends SudahFinal   {
public void tulisan(){
    System.out.println("Class Ini Gagal melakukan Extends");
}
}