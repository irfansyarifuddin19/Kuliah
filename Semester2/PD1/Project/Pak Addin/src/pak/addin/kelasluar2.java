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
public class kelasluar2 {
//class dalam inner class static
private static class programming{    
    private String language;
    private void setLanguage(String language){
        this.language = language;
    }
    private String getLanguage() {
        return language;
    }
}


public static void main(String [] args){
kelasluar2.programming MyLanguage =  new kelasluar2.programming();
MyLanguage.setLanguage("Java");
//menapilkan output
System.out.print("Saya sedang mempejarai :"+MyLanguage.getLanguage());
}}
        
        
        
        
        

