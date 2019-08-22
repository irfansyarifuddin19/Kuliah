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
public class CobaFinal {
    public final void fungsiku (){
        System.out.println("Tidak bisa dilakukan overriding terhadap method ini");
    }
}

class cobaOver extends CobaFinal{
    public final void fungsiku(){
        System.out.println("Mencoba melakukan overriding terhadap method final");
    }
}