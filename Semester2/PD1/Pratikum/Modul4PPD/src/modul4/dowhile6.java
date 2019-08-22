/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author Irfan
 */
public class dowhile6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c;
        do{
            
            
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        while (a+b<=50);
                
        }
        
    }
    

