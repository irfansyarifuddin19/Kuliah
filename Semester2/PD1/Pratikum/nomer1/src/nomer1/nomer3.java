/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer1;
import java.util.Scanner;
/**
 *
 * @author Irfan
 */
public class nomer3 extends huruf {
    public static void main(String[] args) {
        
        konsonan();
    }
    
}
class huruf {
    static void konsonan(){
        Scanner sc = new Scanner (System.in);
        char huruf;
        System.out.println("Masukkan Huruf");
        huruf = sc.next().charAt(0);
        if (huruf =='a'||huruf =='i'||huruf =='u'||huruf=='i'||huruf=='o'){
            System.out.println(huruf+" Merupakan Huruf Vokal");
        }else{
            System.out.println(huruf+" Merupakan Huruf Konsonan");
        }
    }
}