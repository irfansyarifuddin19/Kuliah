/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irfan
 */
public class demostring1 {
    public static void main (String []args) {
        char[] arr= {'a','b','c','d','e'};
        
        String s1 = "contoh string literal";
        String s2 = new String();
        String s3 = new String (arr);
        String s4 = new String (arr,1,3);
        String s5 = new String (s1);
        
        System.out.println ("s1 :"+s1) ;
        System.out.println (" s2 :"+s2);
        System.out.println(" s3 :"+s3);
        System.out.println (" s4 :"+s4);
        System.out.println (" s5 "+s5);
        
        
        
    }
}
