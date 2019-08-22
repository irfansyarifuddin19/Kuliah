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
public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;
    @Override 
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
        return luas;}
    @Override 
    float keliling (){
        float kll = 2 * panjang* lebar;
        System.out.println("keliling Persegi panjang: " + kll);
        return kll;}}
    
