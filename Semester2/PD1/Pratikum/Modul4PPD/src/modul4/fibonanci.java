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
public class fibonanci {
    public static void main(String[] args) {
        int a, b, c;
        a=0; b=1;
        do 
        { c = a+b;
           if (c >=10 && c <= 50 )
           {
               System.out.println(+c);
           }
        
        a = b;
        b = c;
        } 
        while (c <=50);
        
       }
    
}
