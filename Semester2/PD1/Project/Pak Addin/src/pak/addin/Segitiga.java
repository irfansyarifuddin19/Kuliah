/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pak.addin;

/**
 *
 * @author Irfan
 */
public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    
    @Override 
    float luas (){
        float luas = (0.5f *alas * tinggi);
        System.out.println("Luas Segitiga: "+ luas);
        return luas;
    }
}
